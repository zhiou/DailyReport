package com.es.daily_report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.es.daily_report.entities.Report;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Wrapper;
import java.util.Date;
import java.util.List;

@Mapper
public interface ReportMapper extends BaseMapper<Report> {
    @Select("select * from report where on_day BETWEEN #{start} AND #{end} AND author_id in (select id from user where department_id = #{departmentId})")
    List<Report> listByDepartment(String departmentId, Date start, Date end);

    @Select("select * from report where author_id in (select id from user where department_id = #{departmentId})")
    List<Report> listByDepartment(String departmentId);
}
