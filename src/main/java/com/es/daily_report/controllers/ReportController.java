package com.es.daily_report.controllers;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.auth0.jwt.interfaces.Claim;
import com.es.daily_report.dao.ReportDao;
import com.es.daily_report.dao.TaskDao;
import com.es.daily_report.entities.Report;
import com.es.daily_report.entities.Task;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.exception.FileDownloadException;
import com.es.daily_report.handler.CustomCellWriteHandler;
import com.es.daily_report.shiro.JwtUtil;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.ExcelVO;
import com.es.daily_report.vo.ReportVO;
import com.es.daily_report.vo.TaskVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping(value = "/v1/daily_report/report", produces = "application/json;charset=utf-8")
public class ReportController {

    @Autowired
    private ReportDao reportDao;

    @Autowired
    private TaskDao taskDao;

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

        Claim claim = JwtUtil.getClaim(token, JwtUtil.DEPART);
        if (claim == null) {
            return null;
        }
        return claim.asString();
    }

    private String departmentIdFromToken(String token) {
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
        String departmentId = departmentIdFromToken(token);
        if (departmentId == null) {
            return Result.failure(ErrorType.TOKEN_INVALID);
        }
        Report report = reportDao.query(account, reportVO.getOnDay());
        if (report != null) { // remove origin report, override it
            taskDao.removeTasksOfReport(report.getId());
            reportDao.removeById(report.getId());
        }
        report = Report.builder()
                .workCode(account)
                .authorName(username)
                .department(department)
                .departmentId(departmentId)
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

    @GetMapping
    public Result<?> querySelf(@RequestParam("from") @DateTimeFormat(pattern = "yyyy-MM-dd") Date from,
                               @RequestParam("to") @DateTimeFormat(pattern = "yyyy-MM-dd") Date to,
                               @RequestHeader(value = "Authorization") String token
    ) {
        String account = JwtUtil.getClaim(token, JwtUtil.ACCOUNT).asString();
        Map<String, List<ExcelVO>> sheets = taskDao.queryByCondition(0, account, from, to)
                .stream()
                .collect(Collectors.groupingBy(ExcelVO::getWorkCode));
        return Result.success(sheets);
    }

    @GetMapping("/dm")
    @RequiresRoles("dm")
    public Result<?> queryDepartment(@RequestParam("from") @DateTimeFormat(pattern = "yyyy-MM-dd") Date from,
                                     @RequestParam("to") @DateTimeFormat(pattern = "yyyy-MM-dd") Date to,
                                     @RequestHeader(value = "Authorization") String token
    ) {
        String departmentId = JwtUtil.getClaim(token, JwtUtil.DEPART_ID).asString();
        Map<String, List<ExcelVO>> sheets = taskDao.queryByCondition(1, departmentId, from, to)
                .stream()
                .collect(Collectors.groupingBy(ExcelVO::getWorkCode));
        return Result.success(sheets);
    }

    @GetMapping("/pmo")
    @RequiresRoles("pmo")
    public Result<?> queryByCondition(@RequestParam("type") Integer type,
                                      @RequestParam("condition") String content,
                                      @RequestParam("from") @DateTimeFormat(pattern = "yyyy-MM-dd") Date from,
                                      @RequestParam("to") @DateTimeFormat(pattern = "yyyy-MM-dd") Date to
    ) {
        Map<String, List<ExcelVO>> sheets = taskDao.queryByCondition(type, content, from, to)
                .stream()
                .collect(Collectors.groupingBy(ExcelVO::getWorkCode));
        return Result.success(sheets);
    }


    //TODO: 组织任务和日志
    @GetMapping("/download")
    @RequiresRoles("pmo")
    @ApiOperation("根据条件下载符合要求的员工日志表格")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "查询类型0: 用户编号 1: 部门编号 2: 项目编号", dataType = "integer", paramType = "query"),
            @ApiImplicitParam(name = "condition", value = "查询条件", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "from", value = "起始日期：\"yyyy-MM-dd\"", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "to", value = "截止日期：\"yyyy-MM-dd\"", dataType = "string", paramType = "query")
    })
    public void download(@RequestParam("type") Integer type,
                         @RequestParam("condition") String content,
                         @RequestParam("from") @DateTimeFormat(pattern = "yyyy-MM-dd") Date from,
                         @RequestParam("to") @DateTimeFormat(pattern = "yyyy-MM-dd") Date to,
                         HttpServletResponse response) throws FileDownloadException {
        Map<String, List<ExcelVO>> sheets = taskDao
                .queryByCondition(type, content, from, to)
                .stream()
                .collect(Collectors.groupingBy(ExcelVO::groupName));

        String expectFileName = makeFileName(type, sheets);
        if (expectFileName.isEmpty()) {
            throw new FileDownloadException("创建文件名失败");
        }
        try {
            String fileName = URLEncoder.encode(expectFileName, "UTF-8");
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
            writeExcel(sheets, response.getOutputStream());
        } catch (IOException e) {
            throw new FileDownloadException(e.getMessage());
        }
    }

    private void writeExcel(Map<String, List<ExcelVO>> sheets, OutputStream outputStream) {
        ExcelWriter excelWriter = EasyExcel.write(outputStream).build();
        sheets.forEach((key, value) -> {
            WriteSheet writeSheet = EasyExcel.writerSheet(key).build();
            WriteTable writeTable = EasyExcel.writerTable()
                    .head(ExcelVO.class)
                    .registerWriteHandler(new CustomCellWriteHandler())
                    .needHead(true)
                    .build();
            excelWriter.write(value, writeSheet, writeTable);
        });
        excelWriter.finish();
    }

    private String makeFileName(Integer type, Map<String, List<ExcelVO>> sheets) {
        for (List<ExcelVO> sheet : sheets.values()) {
            if (sheet.size() == 0) {
                continue;
            }
            ExcelVO evo = sheet.get(0);
            switch (type) {
                case 0:
                    return evo.getWorkCode() + "_" + evo.getStaffName();
                case 1:
                    return evo.getDepartment();
                case 2:
                    return evo.getProjectName();
            }
            break;
        }
        return "";
    }
}
