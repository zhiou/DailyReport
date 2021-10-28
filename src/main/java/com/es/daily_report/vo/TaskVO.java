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
    private String name;

    @ExcelProperty("任务详情")
    private String details;

    @ExcelProperty("任务工时")
    private Integer cost;

    @ExcelProperty("所属项目")
    @JsonProperty("project_id")
    private String projectId;

    @ExcelProperty("相关产品")
    @JsonProperty("product_id")
    private String productId;
}
