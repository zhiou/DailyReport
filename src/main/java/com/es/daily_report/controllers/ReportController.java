package com.es.daily_report.controllers;

import com.auth0.jwt.interfaces.Claim;
import com.es.daily_report.dao.ReportDao;
import com.es.daily_report.dao.TaskDao;
import com.es.daily_report.dao.UserDao;
import com.es.daily_report.dto.ReportQuery;
import com.es.daily_report.entities.Report;
import com.es.daily_report.entities.Task;
import com.es.daily_report.entities.User;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.enums.ReportStatus;
import com.es.daily_report.mapstruct.TaskVoMapper;
import com.es.daily_report.shiro.JwtUtil;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.ReportVO;
import com.es.daily_report.vo.TaskVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.codec.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    private UserDao userDao;

    @Autowired
    private TaskVoMapper taskVoMapper;

    private ObjectMapper objectMapper;

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

    private List<ReportVO> reportsWithTasks(List<Report> reports) {
        return reports.stream().map(report -> {
            User user = userDao.getById(report.getAuthorId());
            List<Task> tasks = taskDao.queryByReport(report.getId());
            List<TaskVO> taskVOList = tasks.stream().map(task -> {
                return taskVoMapper.taskToTaskVO(task);
            }).collect(Collectors.toList());
            return ReportVO.builder()
                    .onDay(report.getOnDay())
                    .tasks(taskVOList)
                    .author(user.getName())
                    .build();
        }).collect(Collectors.toList());
    }

    // PMO可以通过员工编号，员工部门
    @GetMapping("/pmo")
    @RequiresRoles(value={"admin","pmo"},logical = Logical.OR)
    public Result<?> queryBy(@RequestParam("base64") String base64) throws Exception {
        String query = Base64.decodeToString(base64);
        ReportQuery reportQuery = objectMapper.readValue(query, ReportQuery.class);
        List<Report> reports = reportDao.listByCondition(reportQuery);
        if (reports == null) {
            return Result.failure(ErrorType.INVALID_PARAM);
        }
        return Result.success(reportsWithTasks(reports));
    }

    @GetMapping("/manager")
    @RequiresRoles("manager")
    public Result<?> queryFromManager(@RequestHeader(value = "Authorization") String token) {
        //TODO: 要改数据库表才可以， 这里的部门ID来自OA
        String departmentId = departmentFromToken(token);
        if (departmentId == null) {
            return Result.failure(ErrorType.USER_ID_INVALID);
        }
        ReportQuery reportQuery = ReportQuery.builder()
                .departmentId(departmentId)
                .build();
        List<Report> reports = reportDao.listByCondition(reportQuery);
        return Result.success(reportsWithTasks(reports));
    }

    @GetMapping
    public Result<?> query(@RequestHeader(value = "Authorization") String token) {
        //TODO: 查询字段要改为用户编号
        String account = accountFromToken(token);
        if (account == null) {
            return Result.failure(ErrorType.USER_ID_INVALID);
        }
        List<Report> reports = reportDao.listByUser(account);
        return Result.success(reportsWithTasks(reports));
    }

    @PostMapping
    @Transactional
    public Result<?> create(@RequestBody ReportVO reportVO,
                            @RequestHeader(value = "Authorization") String token) {
        String account = accountFromToken(token);
        if (account == null) {
            return Result.failure(ErrorType.USER_ID_INVALID);
        }
        Report report = reportDao.query(account, reportVO.getOnDay());
        if (report != null) { // remove origin report, override it
            taskDao.removeTasksOfReport(report.getId());
            reportDao.removeById(report.getId());
        }
        report = Report.builder()
                .authorId(account)
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
}
