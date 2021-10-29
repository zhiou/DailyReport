package com.es.daily_report.controllers;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.auth0.jwt.interfaces.Claim;
import com.es.daily_report.dao.ProductDao;
import com.es.daily_report.dao.ProjectDao;
import com.es.daily_report.dao.ReportDao;
import com.es.daily_report.dao.TaskDao;

import com.es.daily_report.dto.ReportQuery;

import com.es.daily_report.dto.UserInfoDTO;
import com.es.daily_report.entities.Product;
import com.es.daily_report.entities.Project;
import com.es.daily_report.entities.Report;
import com.es.daily_report.entities.Task;

import com.es.daily_report.enums.ErrorType;

import com.es.daily_report.mapstruct.TaskVoMapper;
import com.es.daily_report.services.WebService;
import com.es.daily_report.shiro.JwtUtil;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.ExcelVO;
import com.es.daily_report.vo.ReportVO;
import com.es.daily_report.vo.TaskVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.codec.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping(value = "/v1/daily_report/report", produces = "application/json;charset=utf-8")
public class ReportController {

    @Autowired
    private ReportDao reportDao;

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private TaskVoMapper taskVoMapper;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ProjectDao projectDao;

    private ObjectMapper objectMapper;

    @Autowired
    private WebService webService;

    private String accountFromToken(String token) {
        if (token == null || token.isEmpty()) {
            return null;
        }

        Claim claim = JwtUtil.getClaim(token, JwtUtil.ACCOUNT);
        if (claim == null) {
            return null;
        }
        return claim.asString();
    }

    private String departmentFromToken(String token) {
        if (token == null || token.isEmpty()) {
            return null;
        }

        Claim claim = JwtUtil.getClaim(token, JwtUtil.DEPART_ID);
        if (claim == null) {
            return null;
        }
        return claim.asString();
    }

    private String userNameFromToken(String token) {
        if (token == null || token.isEmpty()) {
            return null;
        }

        Claim claim = JwtUtil.getClaim(token, JwtUtil.USER_NAME);
        if (claim == null) {
            return null;
        }
        return claim.asString();
    }

    @PostMapping
    @Transactional
    public Result<?> create(@RequestBody ReportVO reportVO,
                            @RequestHeader(value = "Authorization") String token) {
        String account = accountFromToken(token);
        if (account == null) {
            return Result.failure(ErrorType.TOKEN_INVALID);
        }
        String username = userNameFromToken(token);
        if (username == null) {
            return Result.failure(ErrorType.TOKEN_INVALID);
        }
        String department = departmentFromToken(token);
        if (department == null) {
            return Result.failure(ErrorType.TOKEN_INVALID);
        }
        Report report = reportDao.queryOnDay(account, reportVO.getOnDay());
        if (report != null) { // remove origin report, override it
            taskDao.removeTasksOfReport(report.getId());
            reportDao.removeById(report.getId());
        }
        report = Report.builder()
                .workCode(account)
                .authorName(username)
                .department(department)
                .onDay(reportVO.getOnDay())
                .status(reportVO.getStatus())
                .committed(new Date())
                .build();
        reportDao.saveOrUpdate(report);

        List<Task> tasks = new ArrayList<>();
        for (TaskVO taskVO : reportVO.getTasks()) {
            Task task = Task.builder()
                    .name(taskVO.getName())
                    .details(taskVO.getDetails())
                    .cost(taskVO.getCost())
                    .productId(taskVO.getProductId())
                    .projectId(taskVO.getProjectId())
                    .inReport(report.getId())
                    .build();
            tasks.add(task);
        }
        taskDao.saveBatch(tasks);
        return Result.success();
    }

    private List<ReportVO> reportsWithTasks(List<Report> reports) {
        return reports.stream().map(report -> {
            List<Task> tasks = taskDao.queryByReport(report.getId());
            List<TaskVO> taskVOList = tasks.stream().map(task -> {
                return taskVoMapper.taskToTaskVO(task);
            }).collect(Collectors.toList());
            return ReportVO.builder()
                    .onDay(report.getOnDay())
                    .tasks(taskVOList)
                    .author(report.getAuthorName())
                    .build();
        }).collect(Collectors.toList());
    }

    List<Report> reportsByCondition(String type,
                                    String content,
                                    String from,
                                    String to) {
        List<String> staffNumbers = new ArrayList<>();

        switch (type) {
            case "0":
                staffNumbers.add(content);
                break;
            case "1":
                UserInfoDTO[] staffsInDepartment = webService.getUserInfoByDepartmentId(content);
                for (UserInfoDTO staff : staffsInDepartment) {
                    staffNumbers.add(staff.getWorkcode());
                }
                break;
            case "2":
                UserInfoDTO[] staffsInCompany = webService.getUserInfoByCompany(content);
                for (UserInfoDTO staff : staffsInCompany) {
                    staffNumbers.add(staff.getWorkcode());
                }
                break;
            case "3":
                UserInfoDTO[] staffInJobTitle = webService.getUserInfoByJobTitleId(content);
                for (UserInfoDTO staff : staffInJobTitle) {
                    staffNumbers.add(staff.getWorkcode());
                }
                break;
            case "4":
                List<String> projectMembers = projectDao.queryMemberNumber(content);
                staffNumbers.addAll(projectMembers);
        }
        List<Report> reports = new ArrayList<>();
        try {
            final Date fromDate = DateFormat.getDateInstance().parse(from);
            final Date toDate = DateFormat.getDateInstance().parse(to);
            staffNumbers.forEach(workCode -> {
                ReportQuery reportQuery = ReportQuery.builder()
                        .staffNo(workCode)
                        .start(fromDate)
                        .end(toDate)
                        .build();
                reports.addAll(reportDao.listByRange(reportQuery));
            });
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return reports;
    }

    @GetMapping
    public Result<?> query(@RequestParam("type") String type,
                           @RequestParam("condition") String content,
                           @RequestParam("from") String from,
                           @RequestParam("to") String to) {
        List<Report> reports = reportsByCondition(type, content, from, to);
        return Result.success(reportsWithTasks(reports));
    }

    //TODO: 组织任务和日志
    @GetMapping("/download")
    @ApiOperation("根据条件下载符合要求的员工日志表格")
    @ApiImplicitParams({
        @ApiImplicitParam(name="type",value="查询类型0: 用户编号 1: 部门编号 2: 公司编号 3: 职位编号 4: 项目编号",dataType="string", paramType = "query"),
        @ApiImplicitParam(name="condition",value="查询条件",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="from",value="起始日期：\"yyyy-MM-dd hh:mm:ss\"",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="to",value="截止日期：\"yyyy-MM-dd hh:mm:ss\"",dataType="string", paramType = "query")
    })
    public void download(@RequestParam("type") String type,
                         @RequestParam("condition") String content,
                         @RequestParam("from") String from,
                         @RequestParam("to") String to,
                         HttpServletResponse response) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        String fileName = URLEncoder.encode(content, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");

        List<Report> reports = reportsByCondition(type, content, from, to);

        Map<String, List<ExcelVO>> excel= new HashMap<>();
        reports.forEach(report -> {
            List<Task> tasks = taskDao.queryByReport(report.getId());
            tasks.forEach(task -> {
                if (type.equals("4") && !task.getProjectId().equals(content)) {
                    return;
                }
                Project project = projectDao.queryByNumber(task.getProjectId());
                Product product = productDao.queryByNumber(task.getProductId());
                ExcelVO excelVO = ExcelVO.builder()
                        .staffName(report.getAuthorName())
                        .department(report.getDepartment())
                        .reportDate(DateFormat.getDateInstance().format(report.getOnDay()))
                        .commitDate(DateFormat.getDateInstance().format(report.getCommitted()))
                        .staffNo(report.getWorkCode())
                        .taskName(task.getName())
                        .taskCost(task.getCost().toString())
                        .taskDetail(task.getDetails())
                        .productNo(task.getProductId())
                        .projectNo(task.getProjectId())
                        .productName(product.getName())
                        .projectName(project.getName())
                        .productLine(product.getInLine())
                        .build();
                List<ExcelVO> sheet = excel.get(report.getWorkCode() + "-" + report.getAuthorName());
                if (sheet == null) {
                    sheet = new ArrayList<>();
                    sheet.add(excelVO);
                    excel.put(report.getWorkCode() + "-" + report.getAuthorName(), sheet);
                } else {
                    sheet.add(excelVO);
                }
            });
        });
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).build();
        excel.forEach((key, value) -> {
                WriteSheet writeSheet = EasyExcel.writerSheet(key).build();
                WriteTable writeTable = EasyExcel.writerTable().head(ExcelVO.class).needHead(true).build();
                excelWriter.write(value, writeSheet, writeTable);
        });
        excelWriter.finish();
    }
}
