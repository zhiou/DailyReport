package com.es.daily_report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.es.daily_report.entities.Dm;
import com.es.daily_report.mapper.DmMapper;
import com.es.daily_report.dao.DmDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-16
 */
@Service
public class DmDaoImpl extends ServiceImpl<DmMapper, Dm> implements DmDao {

    @Override
    public Boolean inCharge(String workCode, String departmentId) {
        QueryWrapper<Dm> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("manager_number", workCode);
        queryWrapper.last("LIMIT 1");
        Dm dm = getOne(queryWrapper);
        return dm != null && dm.getDepartmentId().equals(departmentId);
    }
}
