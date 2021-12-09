package com.es.daily_report.controllers;

import com.es.daily_report.dao.TaskDao;
import com.es.daily_report.dto.UserInfoDTO;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.DepartmentVO;
import com.es.daily_report.vo.StaffVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping(value = "/v1/daily_report/department", produces = "application/json;charset=utf-8")
public class DepartmentController {

    @Autowired
    private TaskDao taskDao;


    @GetMapping
    @RequiresRoles(value = {"pmo", "admin"}, logical = Logical.OR)
    public Result<?> list() {
        List<DepartmentVO> departments = taskDao.listDepartments();
        return Result.success(departments);
    }
}
