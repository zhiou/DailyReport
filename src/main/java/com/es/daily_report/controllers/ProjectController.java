package com.es.daily_report.controllers;

import com.es.daily_report.dao.ProjectDao;
import com.es.daily_report.entities.Project;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.ProjectRemoveVO;
import com.es.daily_report.vo.ProjectVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
//TODO: @RequiresRoles("admin")
@RequestMapping(value = "/v1/daily_report/project", produces = "application/json;charset=utf-8")
public class ProjectController {

    @Autowired
    private ProjectDao projectDao;

    @PostMapping
    @ApiOperation("创建新项目")
    @RequiresRoles("pmo")
    public Result<?> create(@RequestBody ProjectVO projectVO) {
        if (projectDao.isNumberExisted(projectVO.getNumber())){
            return Result.failure(ErrorType.PROJECT_EXISTED);
        }
        Project project = Project.builder()
                .number(projectVO.getNumber())
                .managerNumber(projectVO.getManagerNumber())
                .status(projectVO.getStatus())
                .name(projectVO.getName())
                .build();
        projectDao.save(project);
        return Result.success();
    }


    @PutMapping
    @RequiresRoles("pmo")
    public Result<?> update(@RequestBody ProjectVO projectVO) {
        Project project = projectDao.queryByNumber(projectVO.getNumber());
        if (projectVO.getStatus() != null) {
            project.setStatus(projectVO.getStatus());
        }
        if (projectVO.getManagerNumber() != null) {
            project.setManagerNumber(projectVO.getManagerNumber());
        }
        if (projectVO.getName() != null) {
            project.setName(projectVO.getName());
        }
        projectDao.updateById(project);
        return Result.success();
    }

    @GetMapping
    public Result<?> query() {
        return Result.success(projectDao.list());
    }

    @GetMapping("/{number}")
    public Result<?> query(@PathVariable String number) {
        return Result.success(projectDao.queryByNumber(number));
    }

    @DeleteMapping
    @RequiresRoles("pmo")
    public Result<?> remove(@RequestBody ProjectRemoveVO projectRemoveVO) {
        return Result.success(projectDao.batchRemoveByNumber(projectRemoveVO.getNumbers()));
    }
}
