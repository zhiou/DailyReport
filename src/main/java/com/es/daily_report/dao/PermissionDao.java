package com.es.daily_report.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Permission;
import com.es.daily_report.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

@Service
public class PermissionDao extends ServiceImpl<PermissionMapper, Permission> {
}
