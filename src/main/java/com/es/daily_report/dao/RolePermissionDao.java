package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.RolePermission;
import com.es.daily_report.mapper.RolePermissionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionDao extends ServiceImpl<RolePermissionMapper, RolePermission> {
    public List<RolePermission> query(String roleId) {
        QueryWrapper<RolePermission> rolePermissionQueryWrapper = new QueryWrapper<>();
        rolePermissionQueryWrapper.eq("role_id", roleId);
        return list(rolePermissionQueryWrapper);
    }
}
