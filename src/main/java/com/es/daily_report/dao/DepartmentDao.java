package com.es.daily_report.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Department;
import com.es.daily_report.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

@Service
public class DepartmentDao extends ServiceImpl<DepartmentMapper, Department> {
}
