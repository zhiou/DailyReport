package com.es.daily_report.entities;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.es.daily_report.enums.ReportStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "report")
public class Report {
    @TableId(value = "id", type = IdType.AUTO)
    @ExcelIgnore
    private String id;

    @ExcelProperty("员工编号")
    private String workCode;

    @ExcelProperty("员工姓名")
    private String authorName;

    @ExcelIgnore
    private ReportStatus status;

    @ExcelProperty("日志日期")
    private Date onDay;

    @ExcelProperty("提交日期")
    private Date committed;

    @TableLogic
    @JsonIgnore
    @ExcelIgnore
    private Boolean deleted;
}
