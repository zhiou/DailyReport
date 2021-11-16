package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.es.daily_report.entities.Pmo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-16
 */
public interface PmoDao extends IService<Pmo> {
    Boolean hasMember(String workCode);
}
