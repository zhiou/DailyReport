package com.es.daily_report.dao;

import com.es.daily_report.entities.Role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhiou
 * @since 2021-12-01
 */
public interface RoleDao extends IService<Role> {
    Boolean isNameExisted(String name);

    Boolean removeByName(String name);

    Role queryByName(String name);
}
