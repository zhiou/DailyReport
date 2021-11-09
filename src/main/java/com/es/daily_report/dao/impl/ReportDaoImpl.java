package com.es.daily_report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.es.daily_report.entities.Report;
import com.es.daily_report.mapper.ReportMapper;
import com.es.daily_report.dao.ReportDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-09
 */
@Service
public class ReportDaoImpl extends ServiceImpl<ReportMapper, Report> implements ReportDao {
    public Report query(String workCode, Date onDay) {
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("work_code", workCode);
        queryWrapper.eq("on_day", onDay);
        return getOne(queryWrapper);
    }
}
