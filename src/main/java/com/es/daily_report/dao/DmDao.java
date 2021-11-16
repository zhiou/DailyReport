package com.es.daily_report.dao;

import com.es.daily_report.entities.Dm;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-16
 */
public interface DmDao extends IService<Dm> {
    Boolean inCharge(String workCode, String departmentId);
}
