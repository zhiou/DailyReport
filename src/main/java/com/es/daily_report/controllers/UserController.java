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
import com.es.daily_report.redis.RedisUtil;
import com.es.daily_report.services.PasswordHelper;
import com.es.daily_report.shiro.JwtUtil;
import com.es.daily_report.utils.Constants;
import com.es.daily_report.utils.Result;

import com.es.daily_report.vo.LoginVO;
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
@RequestMapping("/daily_report/v1/user")
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
    @PostMapping("/modify_password")
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

//    @Transactional
//    @PostMapping("/create")
//    @RequiresRoles("admin")
//    public Result<?> create(@RequestBody @Validated AccountVO accountVO) {
//        Account account = accountDao.query(accountVO.getAccount());
//        if (account != null) {
//            return Result.failure(ErrorType.ACCOUNT_EXISTED);
//        }
//        User user = User.builder()
//                .name("Anonymous")
//                .state(State.NORMAL)
//                .intro(accountVO.getDesc())
//                .build();
//        // 存储用户密钥
//        user.setPassword(accountVO.getPassword());
//        passwordHelper.encryptPassword(user);
//        userDao.save(user);
//
//        account = Account.builder()
//                .category(AuthType.PASSWORD)
//                .openCode(accountVO.getAccount())
//                .userId(user.getId())
//                .build();
//        accountDao.save(account);
//
//        Role role = roleDao.query("operator");
//        UserRole userRole = UserRole.builder()
//                .userId(user.getId())
//                .roleId(role.getId())
//                .build();
//        userRoleDao.save(userRole);
//        return Result.success(account);
//    }

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
                .username(user.getNumber())
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
