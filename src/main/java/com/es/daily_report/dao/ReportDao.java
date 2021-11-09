package com.es.daily_report.dao;

import com.es.daily_report.entities.Project;
import com.es.daily_report.entities.Report;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-09
 */
public interface ReportDao extends IService<Report> {
    Report query(String workCode, Date onDay);
}
