package com.es.daily_report.controllers;

import com.es.daily_report.dao.ProjectDao;
import com.es.daily_report.dao.RoleDao;
import com.es.daily_report.dao.UserRoleDao;
import com.es.daily_report.dto.UserInfoDTO;
import com.es.daily_report.entities.Project;
import com.es.daily_report.entities.Role;
import com.es.daily_report.entities.UserRole;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.mapstruct.ProjectVOMapper;
import com.es.daily_report.redis.RedisUtil;
import com.es.daily_report.services.WebService;
import com.es.daily_report.shiro.JwtUtil;
import com.es.daily_report.utils.Constants;
import com.es.daily_report.utils.Result;
import com.es.daily_report.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping(value = "/v1/daily_report/user", produces = "application/json;charset=utf-8")
public class UserController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private WebService webService;

    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private ProjectVOMapper projectVOMapper;

    @Autowired
    private UserRoleDao userRoleDao;

    @Autowired
    private RoleDao roleDao;

    @GetMapping
    @RequiresRoles(value = {"pmo", "admin"}, logical = Logical.OR)
    public Result<?> list() {
        UserInfoDTO[] users = webService.getUserInfoByCompany("6");
        List<StaffVO> staffs = Arrays.stream(users).map(user ->
                StaffVO.builder()
                        .workCode(user.getWorkcode())
                        .name(user.getLastname())
                        .department(user.getDepartmentname())
                        .roles(roles(user))
                        .build()
        ).sorted(Comparator.comparingInt(staff -> {
            try {
                return Integer.parseInt(staff.getWorkCode().substring(2));
            } catch(NumberFormatException e) {
                return 0;
            }
        })).collect(Collectors.toList());
        return Result.success(staffs);
    }

    private Boolean addRole(String workCode, String roleName) {
        UserRole userRole = userRoleDao.queryBy(workCode, roleName);
        if (userRole != null) {
            return true;
        }
        Role role = roleDao.queryByName(roleName);
        userRole = new UserRole();
        userRole.setRoleId(role.getId());
        userRole.setUserId(workCode);
        userRoleDao.save(userRole);
        return true;
    }

    private Boolean delRole(String workCode, String roleName) {
        UserRole userRole = userRoleDao.queryBy(workCode, roleName);
        if (userRole != null) {
            userRoleDao.removeById(userRole);
        }
        return true;
    }

    @PutMapping("/role")
    @Transactional
    @RequiresRoles("admin")
    public Result<?> update(@RequestBody List<UserRoleVO> userRoleVOs) {
        userRoleVOs.forEach((userRole -> {
            Boolean success =  ((userRole.getRoleFlag() & 0x4) > 0) ? addRole(userRole.getWorkCode(), "pmo") : delRole(userRole.getWorkCode(), "pmo");
            success &=  ((userRole.getRoleFlag() & 0x2) > 0) ? addRole(userRole.getWorkCode(), "dm") : delRole(userRole.getWorkCode(), "dm");
            success &=  ((userRole.getRoleFlag() & 0x1) > 0) ? addRole(userRole.getWorkCode(), "pm") : delRole(userRole.getWorkCode(), "pm");
        }));

        return Result.success();
    }

    Set<String> roles(UserInfoDTO userInfo) {
        String workCode = userInfo.getWorkcode();
        return userRoleDao.rolesOfUser(workCode);
    }

    @GetMapping("/info")
    public Result<?> info(@RequestHeader(value = "Authorization") String token) {
        String account = JwtUtil.getClaim(token, JwtUtil.ACCOUNT).asString();
        UserInfoDTO userInfoDTO = webService.getUserInfoByWorkCode(account);
        UserInfoVO userInfoVO = UserInfoVO.builder()
                .name(userInfoDTO.getLastname())
                .department(userInfoDTO.getDepartmentname())
                .account(userInfoDTO.getWorkcode())
                .projects(projectsInCharge(account))
                .roles(roles(userInfoDTO))
                .build();
        return Result.success(userInfoVO);
    }

    private List<ProjectVO> projectsInCharge(String workCode) {
        List<Project> projects = new ArrayList<>();
        if (SecurityUtils.getSubject().hasRole("pmo")) {
            projects = projectDao.queryRoot();
        } else if (SecurityUtils.getSubject().hasRole("pm")) {
            projects = projectDao.queryByManagerNumber(workCode)
                    .stream().filter(project -> project.getParentNumber() == null).collect(Collectors.toList());
        }
        List<ProjectVO> rootProjects = projectVOMapper.dos2vos(projects);
        rootProjects.forEach(rootProject -> {
            List<ProjectVO> childProjects = projectVOMapper.dos2vos(projectDao.queryByParentNumber(rootProject.getNumber()));
            // ?????????null???????????????????????????????????????s
            rootProject.setChildren(childProjects.isEmpty() ? null : childProjects);
        });
        return rootProjects;
    }

    //
    @PutMapping("/password")
    @Transactional
    public Result<?> modify(@RequestBody @Validated PasswordUpdateVO passwordUpdateVO,
                            @RequestHeader(value = "Authorization") String token) throws TimeoutException {
        String account = JwtUtil.getClaim(token, JwtUtil.ACCOUNT).asString();
        if (!webService.check(account, passwordUpdateVO.getPassword())) {
            return Result.failure(ErrorType.WRONG_PASSWORD);
        }

        if (webService.changePassword(account, passwordUpdateVO.getNewPassword())) {
            return Result.success();
        }
        return Result.failure(ErrorType.WRONG_PASSWORD);
    }

    @PostMapping("/login")
    public Result<?> login(@RequestBody @Validated LoginVO loginVO) throws TimeoutException {
//        // ???????????????????????????
        if (!webService.check(loginVO.getAccount(), loginVO.getPassword())) {
            return Result.failure(ErrorType.LOGIN_FAILED);
        }

        UserInfoDTO userInfoDTO = webService.getUserInfoByWorkCode(loginVO.getAccount());
        if (userInfoDTO == null) {
            return Result.failure(ErrorType.OA_ACCESS_ERROR);
        }
        String token = JwtUtil.sign(loginVO.getAccount(), userInfoDTO.getDepartmentid(), userInfoDTO.getDepartmentname(),
                userInfoDTO.getLastname(), String.valueOf(System.currentTimeMillis()));

        // ?????????token???????????????redis
        redisUtil.set(Constants.PREFIX_USER_TOKEN + token, token);
        // ??????????????????
        redisUtil.expire(Constants.PREFIX_USER_TOKEN + token, JwtUtil.REFRESH_TOKEN_EXPIRE_TIME / 1000);

        UserTokenVO userTokenVO = UserTokenVO.builder()
                .account(userInfoDTO.getWorkcode())
                .token(token)
                .name(userInfoDTO.getLastname())
                .department(userInfoDTO.getDepartmentname())
                .projects(projectsInCharge(userInfoDTO.getWorkcode()))
                .roles(roles(userInfoDTO))
                .build();
        return Result.success(userTokenVO);
    }

    @PostMapping("/logout")
    public Result<?> logout(@RequestHeader(value = "Authorization") String token) {
        redisUtil.del(Constants.PREFIX_USER_TOKEN + token);

        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            subject.logout();
        }
        return Result.success();
    }
}
