package com.es.daily_report.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Task;
import com.es.daily_report.mapper.TaskMapper;
import org.springframework.stereotype.Service;

@Service
public class TaskDao extends ServiceImpl<TaskMapper, Task> {
}
