package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.dto.ReportQuery;
import com.es.daily_report.entities.Report;
import com.es.daily_report.mapper.ReportMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReportDao extends ServiceImpl<ReportMapper, Report> {
    public Report queryOnDay(String workCode, Date onDay) {
        QueryWrapper<Report> wrapper = new QueryWrapper<>();
        wrapper.eq("work_code", workCode);
        wrapper.eq("on_day", onDay);
        wrapper.last("LIMIT 1");
        return getOne(wrapper);
    }

    public List<Report> listAll(String workCode) {
        QueryWrapper<Report> wrapper = new QueryWrapper<>();
        wrapper.eq("work_code", workCode);
        return list(wrapper);
    }

    public List<Report> listByRange(ReportQuery query) {
        QueryWrapper<Report> wrapper = new QueryWrapper<>();

        if (query.getStaffNo() != null) {
            wrapper.eq("work_code", query.getStaffNo());

            if (query.getStart() != null && query.getEnd() != null) {
                wrapper.between("on_day", query.getStart(), query.getEnd());
            } else if (query.getStart() != null) {
                wrapper.ge("on_day", query.getStart());
            } else if (query.getEnd() != null) {
                wrapper.le("on_day", query.getEnd());
            }
        }
        return list(wrapper);
    }
}
