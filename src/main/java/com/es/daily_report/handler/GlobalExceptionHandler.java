package com.es.daily_report.handler;

import com.auth0.jwt.exceptions.TokenExpiredException;
import com.es.daily_report.enums.ErrorType;
import com.es.daily_report.exception.DrException;
import com.es.daily_report.exception.FileDownloadException;
import com.es.daily_report.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.ExpiredSessionException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;

/**
 * @author MrBird
 */
@Slf4j
@RestControllerAdvice
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result<?> handleException(Exception e) {
        log.error("系统内部异常，异常信息", e);
        return Result.failure(ErrorType.UNKNOWN_ERROR);
    }

    @ExceptionHandler(value = DrException.class)
    public Result<?> handleDrException(DrException e) {
        log.debug("系统错误", e);
        return Result.failure(ErrorType.UNKNOWN_ERROR);
    }

    /**
     * 统一处理请求参数校验(实体对象传参-form)
     *
     * @param e BindException
     * @return FebsResponse
     */
    @ExceptionHandler(BindException.class)
    public Result<?> validExceptionHandler(BindException e) {
        StringBuilder message = new StringBuilder();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for (FieldError error : fieldErrors) {
            message.append(error.getField()).append(error.getDefaultMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        return Result.failure(ErrorType.DATA_BINDING, message.toString());
    }

    /**
     * 统一处理请求参数校验(普通传参)
     *
     * @param e ConstraintViolationException
     * @return FebsResponse
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    public Result<?> handleConstraintViolationException(ConstraintViolationException e) {
        StringBuilder message = new StringBuilder();
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
        for (ConstraintViolation<?> violation : violations) {
            Path path = violation.getPropertyPath();
            String[] pathArr = StringUtils.split(path.toString(), ".");
            message.append(pathArr[1]).append(violation.getMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        return Result.failure(ErrorType.INVALID_PARAM,message.toString());
    }

    /**
     * 统一处理请求参数校验(json)
     *
     * @param e ConstraintViolationException
     * @return FebsResponse
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<?> handlerMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        StringBuilder message = new StringBuilder();
        for (FieldError error : e.getBindingResult().getFieldErrors()) {
            message.append(error.getField()).append(error.getDefaultMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        log.error(message.toString(), e);
        return Result.failure(ErrorType.INVALID_PARAM,message.toString());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Result<?> handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        String message = "缺少类型为" + e.getParameterType() + "的参数" + e.getParameterName();
        log.error(message, e);
        return Result.failure(ErrorType.INVALID_PARAM,message);
    }

    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public Result<?> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        String message = "该方法不支持请求";
        log.error(message, e.getMessage());
        return Result.failure(ErrorType.INVALID_REQUEST, e.getMessage());
    }

//    @ExceptionHandler(value = MaxUploadSizeExceededException.class)
//    public Result<?> handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e) {
//        String message = "文件大小超出限制";
//        log.error(message, e.getMessage());
//        return Result.failure(HttpStatus.PAYLOAD_TOO_LARGE.value(), e.getMessage());
//    }

//    @ExceptionHandler(value = LimitAccessException.class)
//    public Result<?> handleLimitAccessException(LimitAccessException e) {
//        log.error("LimitAccessException, {}", e.getMessage());
//        return Result.failure(HttpStatus.TOO_MANY_REQUESTS.value(), e.getMessage());
//    }

    @ExceptionHandler(value = UnauthorizedException.class)
    public Result<?> handleUnauthorizedException(UnauthorizedException e) {
        log.error("UnauthorizedException, {}", e.getMessage());
        return Result.failure(ErrorType.TOKEN_INVALID, e.getMessage());
    }

    @ExceptionHandler(value = AuthenticationException.class)
    public Result<?> handleAuthenticationException(AuthenticationException e) {
        log.error("AuthenticationException, {}", e.getMessage());
        return Result.failure(ErrorType.TOKEN_INVALID, e.getMessage());
    }

    @ExceptionHandler(value = AuthorizationException.class)
    public Result<?> handleAuthorizationException(AuthorizationException e) {
        log.error("AuthorizationException, {}", e.getMessage());
        return Result.failure(ErrorType.TOKEN_INVALID, e.getMessage());
    }

    @ExceptionHandler(value = ExpiredSessionException.class)
    public Result<?> handleExpiredSessionException(ExpiredSessionException e) {
        log.error("ExpiredSessionException", e);
        return Result.failure(ErrorType.TOKEN_INVALID, e.getMessage());
    }

    @ExceptionHandler(value = TokenExpiredException.class)
    public Result<?> handleExpiredTokenException(TokenExpiredException e) {
        log.error("TokenExpiredException", e);

        return Result.failure(ErrorType.TOKEN_INVALID, e.getMessage());
    }

    @ExceptionHandler(value = FileDownloadException.class)
    public Result<?> handleFileDownloadException(FileDownloadException e) {
        log.error("FileDownloadException", e);
        return Result.failure(ErrorType.UNKNOWN_ERROR, e.getMessage());
    }

    @ExceptionHandler(value = TimeoutException.class)
    public Result<?> handleAxisFaultException(TimeoutException e) {
        log.error("TimeoutException", e);
        return Result.failure(ErrorType.OA_ACCESS_ERROR);
    }
}
