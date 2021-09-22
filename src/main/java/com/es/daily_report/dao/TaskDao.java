package com.es.daily_report.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Role;
import com.es.daily_report.entities.Task;
import com.es.daily_report.mapper.TaskMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskDao extends ServiceImpl<TaskMapper, Task> {
    public List<Task> queryByReport(String reportId) {
        QueryWrapper<Task> wrapper = new QueryWrapper<>();
        wrapper.eq("in_report", reportId);
        return list(wrapper);
    }
}
