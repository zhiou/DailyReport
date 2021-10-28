package com.es.daily_report.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.es.daily_report.enums.ReportStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReportVO {
    @ExcelProperty("任务")
    private List<TaskVO> tasks;

    @ExcelProperty("日志日期")
    @JsonProperty("on_day")
    private Date onDay;

    @ExcelProperty("姓名")
    private String author;

    @ExcelIgnore
    private ReportStatus status;
}
