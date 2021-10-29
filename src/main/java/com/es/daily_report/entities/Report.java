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
    private String id;

    private String workCode;

    private String authorName;

    private String department;

    private ReportStatus status;

    private Date onDay;

    private Date committed;

    @TableLogic
    @JsonIgnore
    private Boolean deleted;
}
