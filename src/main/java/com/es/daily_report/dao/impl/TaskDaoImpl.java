package com.es.daily_report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.es.daily_report.entities.Task;
import com.es.daily_report.mapper.TaskMapper;
import com.es.daily_report.dao.TaskDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.vo.ExcelVO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhiou
 * @since 2021-11-09
 */
@Service
public class TaskDaoImpl extends ServiceImpl<TaskMapper, Task> implements TaskDao {
 public void removeTasksOfReport(Long reportId) {
        QueryWrapper<Task> wrapper = new QueryWrapper<>();
        wrapper.eq("in_report", reportId);
        remove(wrapper);
    }

    public List<ExcelVO> queryByCondition(Integer type, String condition, Date from, Date to) {
        switch (type) {
            case 0:
                return baseMapper.listByWorkCode(condition, from, to);
            case 1:
                return baseMapper.listByDepartment(condition, from, to);
            case 2:
                return baseMapper.listByProject(condition);
            case 3:
                return baseMapper.listByProduct(condition);
        }
        return null;
    }

    public IPage<ExcelVO> pageByCondition(Page<ExcelVO> page, Integer type, String condition) {
        switch (type) {
            case 0:
                return baseMapper.pageByWorkCode(page, condition);
            case 1:
                return baseMapper.pageByDepartment(page, condition);
            case 2:
                return baseMapper.pageByProject(page, condition);
        }
        return baseMapper.pageAll(page);
    }
}
