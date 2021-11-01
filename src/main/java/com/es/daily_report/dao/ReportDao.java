package com.es.daily_report.dao;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.es.daily_report.entities.Report;
import com.es.daily_report.mapper.ReportMapper;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReportDao extends ServiceImpl<ReportMapper, Report> {
    public Report query(String workCode, Date onDay) {
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("work_code", workCode);
        queryWrapper.eq("on_day", onDay);
        return getOne(queryWrapper);
    }
}
