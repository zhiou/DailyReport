package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Auth;
import com.es.daily_report.entities.User;
import com.es.daily_report.mapper.AuthMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthDao extends ServiceImpl<AuthMapper, Auth> {
    public Auth queryByUserId(String userId) {
        QueryWrapper<Auth> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", userId);
        wrapper.last("LIMIT 1");
        return getOne(wrapper);
    }
}
