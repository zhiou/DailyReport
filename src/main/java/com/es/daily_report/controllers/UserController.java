package com.es.daily_report.controllers;

import com.auth0.jwt.interfaces.Claim;

import com.es.daily_report.dao.AuthDao;
import com.es.daily_report.dao.RoleDao;
import com.es.daily_report.dao.UserDao;
import com.es.daily_report.dao.UserRoleDao;
import com.es.daily_report.entities.Auth;
import com.es.daily_report.entities.Role;
import com.es.daily_report.entities.User;
import com.es.daily_report.entities.UserRole;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.enums.StaffState;
import com.es.daily_report.redis.RedisUtil;
import com.es.daily_report.services.PasswordHelper;
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
        if (passwordUpdateVO.getPassword().equals(passwordUpdateVO.getNewPassword()))
        {
            return Result.failure(ErrorType.SAME_PASSWORD);
        }

        User user = userFromToken(token);
        if (user == null) {
            return Result.failure(ErrorType.USER_ID_INVALID);
        }
        Auth auth = authDao.queryByUserId(user.getId());
        if (auth == null) {
            return Result.failure(ErrorType.ACCOUNT_MISSING);
        }
        if(!passwordHelper.verifyPassword(auth, passwordUpdateVO.getPassword())) {
            return Result.failure(ErrorType.WRONG_PASSWORD);
        }
        auth.setCredential(passwordUpdateVO.getNewPassword());
        passwordHelper.encryptPassword(auth);
        authDao.updateById(auth);
        return Result.success();
    }

    @Transactional
    @PostMapping
    @RequiresRoles(value={"admin","pmo"},logical = Logical.OR)
    public Result<?> create(@RequestBody @Validated NewStaffVO newStaffVO) {
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
        // 检查用户名是否存在
        User user = userDao.queryByNo(loginVO.getAccount());
        if (user == null) {
            return Result.failure(ErrorType.ACCOUNT_INVALID);
        }

        Auth auth = authDao.queryByUserId(user.getId());
        if (auth == null) {
            //TODO: 回错误码，账号不存在
            return Result.failure(ErrorType.ACCOUNT_MISSING);
        }
        // 验证密码是否正确
        if(!passwordHelper.verifyPassword(auth, loginVO.getPassword())) {
            return Result.failure(ErrorType.LOGIN_FAILED);
        }
        String token = JwtUtil.sign(user.getNumber(), user.getId(), String.valueOf(System.currentTimeMillis()));

        // 将登录token信息保存到redis
        redisUtil.set(Constants.PREFIX_USER_TOKEN + token, token);
        // 设置超时时间
        redisUtil.expire(Constants.PREFIX_USER_TOKEN + token, JwtUtil.REFRESH_TOKEN_EXPIRE_TIME / 1000);

        String roleName = queryRoleOfUser(user);
        UserTokenVO userTokenVO = UserTokenVO.builder()
                .account(user.getNumber())
                .roleName(roleName)
                .token(token)
                .build();
        return Result.success(userTokenVO);
    }

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

    @PostMapping("/logout")
    public Result<?> logout(@RequestHeader(value = "Authorization") String token) {
        User user = userFromToken(token);
        if (user != null) {
            redisUtil.del(Constants.PREFIX_USER_TOKEN + token);
        }

        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            subject.logout();
        }
        return Result.success();
    }
}
