package com.es.daily_report.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskVO {
    @ExcelProperty("任务名")
    @JsonProperty("task_name")
    private String name;

    @ExcelProperty("任务详情")
    @JsonProperty("task_detail")
    private String details;

    @ExcelProperty("任务工时")
    @JsonProperty("task_cost")
    private Integer cost;

    @ExcelProperty("所属项目")
    @JsonProperty("project_number")
    private String projectId;

    @ExcelProperty("相关产品")
    @JsonProperty("product_number")
    private String productId;
}
