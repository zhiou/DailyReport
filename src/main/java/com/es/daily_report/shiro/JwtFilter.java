package com.es.daily_report.shiro;

import com.auth0.jwt.exceptions.TokenExpiredException;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.utils.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.web.filter.AccessControlFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class JwtFilter extends AccessControlFilter {

    private ObjectMapper objMapper = new ObjectMapper();

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) {
        HttpServletRequest req = (HttpServletRequest)request;
        log.info("servlet request path: {}", req.getServletPath());
        String authorization = req.getHeader("Authorization");
        if (authorization != null) {
            JwtToken token = new JwtToken(authorization);
            try {
                getSubject(request, response).login(token);
            } catch (Exception e) {
                onLoginFailed(response);
                return false;
            }
            return true;
        }
        onLoginFailed(response);
        return false;
    }

    private void onLoginFailed(ServletResponse response) {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setStatus(HttpServletResponse.SC_OK);
        httpResponse.setContentType("application/json;charset=utf-8");
        try {
            httpResponse.getWriter().write(objMapper.writeValueAsString(Result.failure(ErrorType.TOKEN_INVALID)));
        } catch (IOException e) {
            throw new TokenExpiredException("token is invalid");
        }
    }
}
