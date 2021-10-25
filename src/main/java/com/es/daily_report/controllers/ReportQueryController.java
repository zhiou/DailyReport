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
    private TaskVoMapper taskVoMapper;

    @Autowired
    private WebService webService;


}
