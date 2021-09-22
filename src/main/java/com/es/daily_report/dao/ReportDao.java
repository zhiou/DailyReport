package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Report;
import com.es.daily_report.mapper.ReportMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReportDao extends ServiceImpl<ReportMapper, Report> {
    public Report query(String authorId, Date onDay) {
        QueryWrapper<Report> wrapper = new QueryWrapper<>();
        wrapper.eq("author_id", authorId);
        wrapper.eq("on_day", onDay);
        wrapper.last("LIMIT 1");
        return getOne(wrapper);
    }

    public List<Report> listByUser(String authorId) {
        QueryWrapper<Report> wrapper = new QueryWrapper<>();
        wrapper.eq("author_id", authorId);
        return list(wrapper);
    }

    public List<Report> listByCondition(Integer type, String content) {
        QueryWrapper<Report> wrapper = new QueryWrapper<>();
        switch (type) {
            case 0:
                wrapper.eq("author_id", content);
                break;
            case 1:
                return baseMapper.listByDepartment(content);
        }
        return null;
    }
}
