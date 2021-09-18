package com.es.daily_report.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.es.daily_report.entities.Project;
import com.es.daily_report.mapper.ProjectMapper;
import org.springframework.stereotype.Service;

@Service
public class ProjectDao extends ServiceImpl<ProjectMapper, Project> {
}
