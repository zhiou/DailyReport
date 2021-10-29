package com.es.daily_report.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExcelVO {

    @ExcelProperty("产品线")
    private String productLine;

    @ExcelProperty("产品")
    private String productName;

    @ExcelProperty("部门")
    private String department;

    @ExcelProperty("员工姓名")
    private String staffName;

    @ExcelProperty("工时")
    private String taskCost;

    @ExcelProperty("项目")
    private String projectName;

    @ExcelProperty("报告日期")
    private String reportDate;

    @ExcelProperty("任务名")
    private String taskName;

    @ExcelProperty("任务详情")
    private String taskDetail;

    @ExcelProperty("提交日期")
    private String commitDate;
}
