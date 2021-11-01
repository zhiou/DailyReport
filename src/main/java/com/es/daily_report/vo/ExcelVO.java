package com.es.daily_report.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.*;
import com.baomidou.mybatisplus.annotation.TableField;
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
    private String productLine;

    @ExcelProperty("产品")
    private String productName;

    @ExcelProperty("部门")
    private String department;

    @ExcelIgnore
    private String workCode;

    @ExcelProperty("员工姓名")
    private String staffName;

    @ExcelProperty("工时")
    private Integer taskCost;

    @ExcelProperty("项目")
    private String projectName;

    @ExcelProperty("报告日期")
    private Date reportDate;

    @ExcelProperty("任务名")
    private String taskName;

    @ExcelProperty("任务详情")
    private String taskDetail;

    @ExcelProperty("提交日期")
    private Date commitDate;

    public String groupName() {
        return workCode + "-" + staffName;
    }
}
