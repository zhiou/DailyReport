package com.es.daily_report.shiro;

import com.auth0.jwt.exceptions.TokenExpiredException;
import com.es.daily_report.dao.UserRoleDao;
import com.es.daily_report.dto.UserInfoDTO;
import com.es.daily_report.redis.RedisUtil;
import com.es.daily_report.services.WebService;
import com.es.daily_report.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

@Slf4j
public class JwtRealm extends AuthorizingRealm {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private WebService webService;

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String staffNo = (String) principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        UserInfoDTO userInfo = webService.getUserInfoByWorkCode(staffNo);
        String workCode = userInfo.getWorkcode();
        Set<String> roles = userRoleDao.rolesOfUser(workCode);

        simpleAuthorizationInfo.setRoles(roles);

        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
       String credentials = (String)token.getCredentials();
       if (credentials == null) {
           throw new AuthenticationException("token is empty!");
       }

       String[] parts = credentials.split(" ");
        if (parts.length < 1) {
            throw new AuthenticationException("token is invalid!");
        }
       String jwt = parts[parts.length - 1];
       String staffNo = JwtUtil.getClaim(jwt, JwtUtil.ACCOUNT).asString();
        if (staffNo == null) {
            throw new AuthenticationException("token is invalid!");
        }

        String departId = JwtUtil.getClaim(jwt, JwtUtil.DEPART_ID).asString();
        if (departId == null) {
            throw new AuthenticationException("token is invalid!");
        }

        String depart = JwtUtil.getClaim(jwt, JwtUtil.DEPART).asString();
        if (depart == null) {
            throw new AuthenticationException("token is invalid!");
        }

        String username = JwtUtil.getClaim(jwt, JwtUtil.USER_NAME).asString();
        if (username == null) {
            throw new AuthenticationException("token is invalid!");
        }

        // 检查redis中的token是否存在
        String credential = String.valueOf(redisUtil.get(Constants.PREFIX_USER_TOKEN + jwt));
        log.info("redis中的credential:{}",credential);
        if (credential == null || credential.equals("null") || credential.isEmpty()){
            throw new AuthenticationException("token expried!");
        }
        // 刷新token
        if (!jwtTokenRefresh(jwt, staffNo, departId, depart, username)) {
            throw new AuthenticationException("Token失效请重新登录!");
        }

        // 判断用户状态

        // 交给shiro做认证
        return new SimpleAuthenticationInfo(
                staffNo,
                credentials,
                getName()
        );
    }

    /**
     * JWTToken刷新生命周期 （解决用户一直在线操作，提供Token失效问题）
     * 1、登录成功后将用户的JWT生成的Token作为k、v存储到cache缓存里面(这时候k、v值一样)
     * 2、当该用户再次请求时，通过JWTFilter层层校验之后会进入到doGetAuthenticationInfo进行身份验证
     * 3、当该用户这次请求JWTToken值还在生命周期内，则会通过重新PUT的方式k、v都为Token值，缓存中的token值生命周期时间重新计算(这时候k、v值一样)
     * 4、当该用户这次请求jwt生成的token值已经超时，但该token对应cache中的k还是存在，则表示该用户一直在操作只是JWT的token失效了，程序会给token对应的k映射的v值重新生成JWTToken并覆盖v值，该缓存生命周期重新计算
     * 5、当该用户这次请求jwt在生成的token值已经超时，并在cache中不存在对应的k，则表示该用户账户空闲超时，返回用户信息已失效，请重新登录。
     * 6、每次当返回为true情况下，都会给Response的Header中设置Authorization，该Authorization映射的v为cache对应的v值。
     * 7、注：当前端接收到Response的Header中的Authorization值会存储起来，作为以后请求token使用
     * @param account
     * @param departmentId
     * @return
     */
    private boolean jwtTokenRefresh(String token, String account, String departmentId, String department, String userName) {
        String cacheToken = String.valueOf(redisUtil.get(Constants.PREFIX_USER_TOKEN + token));
        if (cacheToken != null && !cacheToken.isEmpty()) {
            // 校验token有效性
            try {
                if (!JwtUtil.verify(cacheToken)) {
                    String newAuthorization = JwtUtil.sign(account, departmentId, department, userName, String.valueOf(System.currentTimeMillis()));
                    redisUtil.set(Constants.PREFIX_USER_TOKEN + token, newAuthorization);
                    // 设置超时时间
                    redisUtil.expire(Constants.PREFIX_USER_TOKEN + token, JwtUtil.REFRESH_TOKEN_EXPIRE_TIME / 1000);
                } else {
                    redisUtil.set(Constants.PREFIX_USER_TOKEN + token, cacheToken);
                    // 设置超时时间
                    redisUtil.expire(Constants.PREFIX_USER_TOKEN + token, JwtUtil.REFRESH_TOKEN_EXPIRE_TIME / 1000);
                }
            } catch (TokenExpiredException e) {
                return false;
            }
            return true;
        }
        return false;
    }
}
