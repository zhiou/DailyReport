package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Role;
import com.es.daily_report.mapper.RoleMapper;
import org.springframework.stereotype.Service;

@Service
public class RoleDao extends ServiceImpl<RoleMapper, Role> {
    public Role query(String code) {
        QueryWrapper<Role> wrapper = new QueryWrapper<>();
        wrapper.eq("name", code);
        wrapper.last("LIMIT 1");
        return getOne(wrapper);
    }
}
