package com.es.daily_report.controllers;

import com.es.daily_report.dao.ProjectDao;
import com.es.daily_report.entities.Project;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.mapstruct.ProjectVOMapper;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.ProjectRemoveVO;
import com.es.daily_report.vo.ProjectVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/v1/daily_report/project", produces = "application/json;charset=utf-8")
public class ProjectController {

    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private ProjectVOMapper projectVOMapper;

    @PostMapping
    @ApiOperation("创建新项目")
    @RequiresRoles(value = {"pmo", "pm"}, logical = Logical.OR)
    @Transactional
    public Result<?> create(@RequestBody ProjectVO projectVO) {
        if (projectDao.isNumberExisted(projectVO.getNumber())) {
            return Result.failure(ErrorType.PROJECT_EXISTED);
        }
        Project project = projectVOMapper.vo2do(projectVO);
        projectDao.save(project);
        return Result.success();
    }


    @PutMapping
    @RequiresRoles(value = {"pmo", "pm"}, logical = Logical.OR)
    @Transactional
    public Result<?> update(@RequestBody ProjectVO projectVO) {
        Project project = projectDao.queryByNumber(projectVO.getNumber());
        if (projectVO.getStatus() != null) {
            project.setStatus(projectVO.getStatus().getValue());
        }
        if (projectVO.getManagerNumber() != null) {
            project.setManagerNumber(projectVO.getManagerNumber());
        }
        if (projectVO.getManagerName() != null) {
            project.setManagerName(projectVO.getManagerName());
        }
        if (projectVO.getName() != null) {
            project.setName(projectVO.getName());
        }
        if (projectVO.getRemark() != null) {
            project.setRemark(projectVO.getRemark());
        }
        if (projectVO.getParentNumber() != null) {
            project.setParentNumber(projectVO.getParentNumber());
        }
        projectDao.updateById(project);
        return Result.success();
    }

    @GetMapping
    public Result<?> query() {
        List<ProjectVO> rootProjects = projectVOMapper.dos2vos(projectDao.queryRoot());
        rootProjects.forEach(rootProject -> {
            List<ProjectVO> childProjects = projectVOMapper.dos2vos(projectDao.queryByParentNumber(rootProject.getNumber()));
           rootProject.setChildren(childProjects);
        });
        return Result.success(rootProjects);
    }

    @GetMapping("/{number}")
    public Result<?> query(@PathVariable String number) {
        ProjectVO projectVO = projectVOMapper.do2vo(projectDao.queryByNumber(number));
        List<ProjectVO> childProjects = projectVOMapper.dos2vos(projectDao.queryByParentNumber(projectVO.getNumber()));
        projectVO.setChildren(childProjects);
        return Result.success(projectVO);
    }

    @DeleteMapping
    @RequiresRoles(value = {"pmo", "pm"}, logical = Logical.OR)
    @Transactional
    public Result<?> remove(@RequestBody ProjectRemoveVO projectRemoveVO) {
        for (String number: projectRemoveVO.getNumbers()) {
            projectDao.queryByParentNumber(number)
                    .forEach(project -> {
                        projectDao.removeById(project);
                    });
        }
        return Result.success(projectDao.batchRemoveByNumber(projectRemoveVO.getNumbers()));
    }
}
