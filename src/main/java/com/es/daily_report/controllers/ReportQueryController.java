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
import com.es.daily_report.mapstruct.TaskVoMapper;
import com.es.daily_report.shiro.JwtUtil;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.ReportVO;
import com.es.daily_report.vo.TaskVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping(value = "/v1/daily_report/report_query", produces = "application/json;charset=utf-8")
public class ReportQueryController {
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

    private Date firstDayInMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println (new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
        return cal.getTime();

    }

    private Date lastDayInMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.roll(Calendar.DAY_OF_MONTH, -1);
        System.out.println (new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
        return cal.getTime();
    }

    @GetMapping
    public Result<?> queryOnDay(@RequestHeader(value = "Authorization") String token,
                                @RequestParam("type") String type,
                                @RequestParam("date") String dateString) throws ParseException {
        User user = userFromToken(token);
        if (user == null) {
            return Result.failure(ErrorType.USER_ID_INVALID);
        }
        Date date = DateFormat.getDateInstance().parse(dateString);
        List<Report> reports = new ArrayList<>();
        if (type.equals("day")) {
            Report report = reportDao.query(user.getId(), date);
            reports.add(report);
        } else if (type.equals("month")) {
            ReportQuery reportQuery = ReportQuery.builder().staffNo(user.getNumber())
                    .start(firstDayInMonth(date))
                    .end(lastDayInMonth(date))
                    .build();
            reports = reportDao.listByCondition(reportQuery);
        }
        return Result.success(reportsWithTasks(reports));
    }
}
