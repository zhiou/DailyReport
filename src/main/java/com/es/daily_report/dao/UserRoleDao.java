package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.UserRole;
import com.es.daily_report.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

@Service
public class UserRoleDao extends ServiceImpl<UserRoleMapper, UserRole> {
    public UserRole query(String userId) {
        QueryWrapper<UserRole> userRoleQueryWrapper = new QueryWrapper<>();
        userRoleQueryWrapper.eq("user_id", userId);
        userRoleQueryWrapper.last("LIMIT 1");
        return getOne(userRoleQueryWrapper);
    }
}
