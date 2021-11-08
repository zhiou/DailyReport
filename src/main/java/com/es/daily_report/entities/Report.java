package com.es.daily_report.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhiou
 * @since 2021-11-08
 */
@Getter
@Setter
@TableName("report")
@ApiModel(value = "Report对象", description = "")
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("员工编号")
    @TableField("work_code")
    private String workCode;

    @ApiModelProperty("员工姓名")
    @TableField("author_name")
    private String authorName;

    @ApiModelProperty("所属部门")
    @TableField("department")
    private String department;

    @ApiModelProperty("所属部门ID")
    @TableField("department_id")
    private String departmentId;

    @ApiModelProperty("日志日期")
    @TableField("on_day")
    private LocalDate onDay;

    @ApiModelProperty("状态0：保存 1：提交")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("提交时间")
    @TableField("committed")
    private LocalDateTime committed;

    @ApiModelProperty("删除状态")
    @TableField("deleted")
    @TableLogic
    private Integer deleted;


}
