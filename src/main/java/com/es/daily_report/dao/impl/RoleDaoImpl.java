package com.es.daily_report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.dao.RoleDao;
import com.es.daily_report.entities.Role;
import com.es.daily_report.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhiou
 * @since 2021-12-01
 */
@Service
public class RoleDaoImpl extends ServiceImpl<RoleMapper, Role> implements RoleDao {
    public Boolean isNameExisted(String name) {
        QueryWrapper<Role> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        queryWrapper.last("LIMIT 1");
        return getOne(queryWrapper) != null;
    }

    public Boolean removeByName(String name) {
        QueryWrapper<Role> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        return remove(queryWrapper);
    }

    public Role queryByName(String name) {
        QueryWrapper<Role> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        queryWrapper.last("LIMIT 1");
        return getOne(queryWrapper);
    }
}
