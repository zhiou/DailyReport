package com.es.daily_report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.es.daily_report.entities.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper extends BaseMapper<Project> {
    @Select("select distinct work_code from report r where #{projectNumber} = (select project_id from task t where t.in_report = r.id)")
    List<String> queryMembers(String projectNumber);
}
