package com.es.daily_report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.es.daily_report.entities.Report;
import com.es.daily_report.vo.ExcelVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Wrapper;
import java.util.Date;
import java.util.List;

@Mapper
public interface ReportMapper extends BaseMapper<Report> {

}
