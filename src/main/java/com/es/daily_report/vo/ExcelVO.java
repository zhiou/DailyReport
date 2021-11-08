package com.es.daily_report.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.*;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import com.alibaba.excel.enums.poi.HorizontalAlignmentEnum;


import java.util.Date;

@Data
@Builder
@HeadRowHeight(20)
@HeadStyle(horizontalAlignment = HorizontalAlignmentEnum.CENTER)//表头样式
@ContentStyle(horizontalAlignment = HorizontalAlignmentEnum.CENTER)//内容样式
public class ExcelVO {
    @ExcelProperty("产品线")
    @JsonProperty("product_line")
    private String productLine;

    @ExcelIgnore
    @JsonProperty("product_number")
    private String productNumber;

    @ExcelProperty("产品")
    @JsonProperty("product_name")
    private String productName;

    @ExcelProperty("部门")
    private String department;

    @ExcelIgnore
    @JsonProperty("work_code")
    private String workCode;

    @ExcelProperty("员工姓名")
    @JsonProperty("staff_name")
    private String staffName;

    @ExcelProperty("工时")
    @JsonProperty("task_cost")
    private Integer taskCost;

    @ExcelIgnore
    @JsonProperty("project_number")
    private String projectNumber;

    @ExcelProperty("项目")
    @JsonProperty("project_name")
    private String projectName;

    @ExcelProperty("报告日期")
    @JsonProperty("report_date")
    private Date reportDate;

    @ExcelProperty("任务名")
    @JsonProperty("task_name")
    private String taskName;

    @ExcelProperty("任务详情")
    @JsonProperty("task_detail")
    private String taskDetail;

    @ExcelProperty("提交日期")
    @JsonProperty("commit_date")
    private Date commitDate;

    public String sheetName() {
        return workCode + "-" + staffName;
    }
}
