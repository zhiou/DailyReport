package com.es.daily_report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.es.daily_report.entities.Report;
import com.es.daily_report.mapper.ReportMapper;
import com.es.daily_report.dao.ReportDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Report query(String workCode, LocalDate onDay) {
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("work_code", workCode);
        queryWrapper.eq("on_day", onDay.format(formatter));
        return getOne(queryWrapper);
    }
}
