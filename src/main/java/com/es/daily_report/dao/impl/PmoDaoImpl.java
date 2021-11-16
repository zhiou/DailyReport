package com.es.daily_report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.es.daily_report.entities.Pmo;
import com.es.daily_report.mapper.PmoMapper;
import com.es.daily_report.dao.PmoDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-16
 */
@Service
public class PmoDaoImpl extends ServiceImpl<PmoMapper, Pmo> implements PmoDao {

    @Override
    public Boolean hasMember(String workCode)    {
        QueryWrapper<Pmo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("member_number", workCode);
        List<Pmo> result = list(queryWrapper);
        return result.stream().map(Pmo::getMemberNumber).collect(Collectors.toList()).contains(workCode);
    }
}
