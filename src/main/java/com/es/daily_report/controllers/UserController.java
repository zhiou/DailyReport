package com.es.daily_report.controllers;

import com.auth0.jwt.interfaces.Claim;

import com.es.daily_report.dao.*;
import com.es.daily_report.dto.UserInfoDTO;
import com.es.daily_report.entities.*;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.enums.StaffState;
import com.es.daily_report.redis.RedisUtil;
import com.es.daily_report.services.PasswordHelper;
import com.es.daily_report.services.WebService;
import com.es.daily_report.shiro.JwtUtil;
import com.es.daily_report.utils.Constants;
import com.es.daily_report.utils.Result;

import com.es.daily_report.vo.LoginVO;
import com.es.daily_report.vo.NewStaffVO;
import com.es.daily_report.vo.PasswordUpdateVO;
import com.es.daily_report.vo.UserTokenVO;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/v1/daily_report/user", produces = "application/json;charset=utf-8")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private AuthDao authDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private UserRoleDao userRoleDao;

    @Autowired
    private PasswordHelper passwordHelper;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private WebService webService;

    private String queryRoleOfUser(User user) {
        UserRole userRole = userRoleDao.query(user.getId());
        Role role = roleDao.getById(userRole.getRoleId());
        return role.getName();
    }
//
    @PutMapping("/password")
    @Transactional
    public Result<?> modify(@RequestBody @Validated PasswordUpdateVO passwordUpdateVO,
                                    @RequestHeader(value = "Authorization") String token) {
        String account = JwtUtil.getClaim(token, JwtUtil.ACCOUNT).asString();
        if (!webService.check(account, passwordUpdateVO.getPassword())) {
            return Result.failure(ErrorType.WRONG_PASSWORD);
        }

       if (webService.changePassword(account, passwordUpdateVO.getNewPassword())) {
           return Result.success();
       }
       //TODO: 用webService返回的错误代替， 或者另外定义错误码
       return Result.failure(ErrorType.WRONG_PASSWORD);
    }

    @Transactional
    @PostMapping
    @RequiresRoles(value={"admin","pmo"},logical = Logical.OR)
    public Result<?> create(@RequestBody NewStaffVO newStaffVO) {
        User userExisted = userDao.queryByNo(newStaffVO.getStaffNumber());
        if (userExisted != null) {
            return Result.failure(ErrorType.ACCOUNT_EXISTED);
        }
        User user = User.builder()
                .name(newStaffVO.getName())
                .departmentId(newStaffVO.getDepartmentId())
                .number(newStaffVO.getStaffNumber())
                .state(StaffState.WORKING)
                .build();
        userDao.save(user);

        // 存储用户密钥
        Auth auth = Auth.builder()
                .userId(user.getId())
                .credential(newStaffVO.getDefaultPassword())
                .type("password")
                .build();
        passwordHelper.encryptPassword(auth);
        authDao.save(auth);

        Role role = roleDao.query(newStaffVO.getRole().getName());
        UserRole userRole = UserRole.builder()
                .userId(user.getId())
                .roleId(role.getId())
                .build();
        userRoleDao.save(userRole);
        return Result.success();
    }

    @PostMapping("/login")
    public Result<?> login(@RequestBody @Validated LoginVO loginVO) {
//        // 检查用户名是否存在
        if (!webService.check(loginVO.getAccount(), loginVO.getPassword())) {
            return Result.failure(ErrorType.LOGIN_FAILED);
        }

        UserInfoDTO userInfoDTO = webService.getUserInfoByNumber(loginVO.getAccount());

        String token = JwtUtil.sign(loginVO.getAccount(), userInfoDTO.getDepartmentid(), String.valueOf(System.currentTimeMillis()));

        // 将登录token信息保存到redis
        redisUtil.set(Constants.PREFIX_USER_TOKEN + token, token);
        // 设置超时时间
        redisUtil.expire(Constants.PREFIX_USER_TOKEN + token, JwtUtil.REFRESH_TOKEN_EXPIRE_TIME / 1000);

        UserTokenVO userTokenVO = UserTokenVO.builder()
                .account(userInfoDTO.getWorkcode())
                .token(token)
                .name(userInfoDTO.getLastname())
                .department(userInfoDTO.getDepartmentname())
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
