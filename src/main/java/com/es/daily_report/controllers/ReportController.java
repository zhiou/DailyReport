package com.es.daily_report.controllers;

import com.auth0.jwt.interfaces.Claim;
import com.es.daily_report.dao.ReportDao;
import com.es.daily_report.dao.TaskDao;

import com.es.daily_report.dto.ReportQuery;

import com.es.daily_report.dto.UserInfoDTO;
import com.es.daily_report.entities.Report;
import com.es.daily_report.entities.Task;

import com.es.daily_report.enums.ErrorType;

import com.es.daily_report.mapstruct.TaskVoMapper;
import com.es.daily_report.services.WebService;
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

import java.text.DateFormat;
import java.text.ParseException;
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
    private TaskVoMapper taskVoMapper;

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
        Report report = reportDao.queryOnDay(account, reportVO.getOnDay());
        if (report != null) { // remove origin report, override it
            taskDao.removeTasksOfReport(report.getId());
            reportDao.removeById(report.getId());
        }
        report = Report.builder()
                .workCode(account)
                .authorName(username)
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

    @GetMapping
    public Result<?> query(@RequestParam("type") String type,
                           @RequestParam("condition") String content,
                           @RequestParam("from") String from,
                           @RequestParam("to") String to) {

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
        }
        List<Report> reports = new ArrayList<Report>();
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

        return Result.success(reportsWithTasks(reports));
    }
}
