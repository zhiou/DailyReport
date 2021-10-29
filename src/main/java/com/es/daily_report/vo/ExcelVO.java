package com.es.daily_report.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExcelVO {
    @ExcelProperty("员工编号")
    private String staffNo;

    @ExcelProperty("员工姓名")
    private String staffName;

    @ExcelProperty("所属部门")
    private String department;

    @ExcelProperty("任务名")
    private String taskName;

    @ExcelProperty("任务耗时")
    private String taskCost;

    @ExcelProperty("任务详情")
    private String taskDetail;

    @ExcelProperty("项目编号")
    private String projectNo;

    @ExcelProperty("项目名")
    private String projectName;

    @ExcelProperty("产品编号")
    private String productNo;

    @ExcelProperty("产品名")
    private String productName;

    @ExcelProperty("产品线")
    private String productLine;

    @ExcelProperty("报告日期")
    private String reportDate;

    @ExcelProperty("提交日期")
    private String commitDate;
}
