package com.es.daily_report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.es.daily_report.entities.Task;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskMapper extends BaseMapper<Task> {
}
