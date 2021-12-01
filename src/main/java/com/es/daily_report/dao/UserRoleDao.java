package com.es.daily_report.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.es.daily_report.entities.UserRole;

import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhiou
 * @since 2021-12-01
 */
public interface UserRoleDao extends IService<UserRole> {
    Set<String> rolesOfUser(String workCode);

    UserRole queryBy(String workCode, String roleName);
}
