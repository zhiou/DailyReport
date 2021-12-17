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
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
    @RequiresRoles("pmo")
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
    @RequiresRoles("pmo")
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
        projectDao.updateById(project);
        return Result.success();
    }

    @GetMapping
    public Result<?> query() {
        return Result.success(projectVOMapper
                .dos2vos(projectDao.list()));
    }

    @GetMapping("/{number}")
    public Result<?> query(@PathVariable String number) {
        return Result.success(projectVOMapper.do2vo(projectDao.queryByNumber(number)));
    }

    @DeleteMapping
    @RequiresRoles("pmo")
    @Transactional
    public Result<?> remove(@RequestBody ProjectRemoveVO projectRemoveVO) {
        return Result.success(projectDao.batchRemoveByNumber(projectRemoveVO.getNumbers()));
    }
}
