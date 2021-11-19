package com.es.daily_report.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.es.daily_report.enums.ReportStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
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
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate onDay;

    @ExcelProperty("姓名")
    private String author;

    @ExcelIgnore
    private ReportStatus status;
}
