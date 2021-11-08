package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.es.daily_report.entities.Task;
import com.es.daily_report.mapper.TaskMapper;
import com.es.daily_report.vo.ExcelVO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TaskDao extends ServiceImpl<TaskMapper, Task> {

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
                return baseMapper.listByProject(condition, from, to);
        }
        return null;
    }
}
