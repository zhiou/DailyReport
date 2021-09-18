package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.User;
import com.es.daily_report.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserDao extends ServiceImpl<UserMapper, User> {
    public User queryByNo(String userNo) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("number", userNo);
        wrapper.last("LIMIT 1");
        return getOne(wrapper);
    }
}
