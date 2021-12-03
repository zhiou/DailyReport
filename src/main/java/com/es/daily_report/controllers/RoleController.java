package com.es.daily_report.controllers;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.es.daily_report.dao.RoleDao;
import com.es.daily_report.entities.Role;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.mapstruct.RoleVOMapper;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.RoleVO;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhiou
 * @since 2021-12-01
 */
@RestController
@RequiresRoles("admin")
@RequestMapping("/daily_report/role")
public class RoleController {
    @Autowired
    private RoleDao roleDao;

    @Autowired
    private RoleVOMapper roleVOMapper;

    @GetMapping
    public Result<?> roles() {
        List<RoleVO> roles = roleVOMapper.dos2vos(roleDao.list());
        return Result.success(roles);
    }

    @PostMapping
    @Transactional
    public Result<?> create(@RequestBody RoleVO roleVO) {
        if (roleDao.isNameExisted(roleVO.getName())) {
            return Result.failure(ErrorType.ROLE_EXISTED);
        }
        Role role = roleVOMapper.vo2do(roleVO);
        roleDao.save(role);
        return Result.success();
    }

    @DeleteMapping
    @Transactional
    public Result<?> remove(@RequestBody RoleVO roleVO) {
        if (!roleDao.isNameExisted(roleVO.getName())) {
            return Result.failure(ErrorType.INVALID_PARAM);
        }
        roleDao.removeByName(roleVO.getName());
        return Result.success();
    }
}

