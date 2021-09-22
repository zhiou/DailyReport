package com.es.daily_report.controllers;

import com.auth0.jwt.interfaces.Claim;
import com.es.daily_report.dao.ReportDao;
import com.es.daily_report.dao.TaskDao;
import com.es.daily_report.dao.UserDao;
import com.es.daily_report.entities.Report;
import com.es.daily_report.entities.Task;
import com.es.daily_report.entities.User;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.mapstruct.TaskVoMapper;
import com.es.daily_report.shiro.JwtUtil;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.ReportVO;
import com.es.daily_report.vo.TaskVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
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

    private User userFromToken(String token) {
        if (token == null || token.isEmpty()) {
            return null;
        }

        Claim claim = JwtUtil.getClaim(token, JwtUtil.UID);
        if (claim == null) {
            return null;
        }
        String userId = claim.asString();
        return userDao.getById(userId);
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
    public Result<?> queryBy(@RequestParam("type") Integer type, @RequestParam("condition") String condition) {
        List<Report> reports = reportDao.listByCondition(type, condition);
        if (reports == null) {
            return Result.failure(ErrorType.INVALID_PARAM);
        }
        return Result.success(reportsWithTasks(reports));
    }

    @GetMapping("/manager")
    @RequiresRoles("manager")
    public Result<?> queryFromManager(@RequestHeader(value = "Authorization") String token) {
        User user = userFromToken(token);
        if (user == null) {
            return Result.failure(ErrorType.USER_ID_INVALID);
        }
        List<Report> reports = reportDao.listByCondition(1, user.getDepartmentId());
        return Result.success(reportsWithTasks(reports));
    }

    @GetMapping
    public Result<?> query(@RequestHeader(value = "Authorization") String token) {
        User user = userFromToken(token);
        if (user == null) {
            return Result.failure(ErrorType.USER_ID_INVALID);
        }
        List<Report> reports = reportDao.listByUser(user.getId());
        return Result.success(reportsWithTasks(reports));
    }

    @PostMapping
    @Transactional
    public Result<?> create(@RequestBody @Validated ReportVO reportVO,
                            @RequestHeader(value = "Authorization") String token) {
        User user = userFromToken(token);
        if (user == null) {
            return Result.failure(ErrorType.USER_ID_INVALID);
        }
        Report reportExisted = reportDao.query(user.getId(), reportVO.getOnDay());
        if (reportExisted != null) {
            return Result.failure(ErrorType.REPORT_EXISTED);
        }
        Report report = Report.builder()
                .authorId(user.getId())
                .onDay(reportVO.getOnDay())
                .committed(new Date())
                .build();
        reportDao.save(report);

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
