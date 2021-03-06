package com.es.daily_report.entities;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

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
@TableName("project")
@ApiModel(value = "Project对象", description = "")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("项目编号")
    @TableField("number")
    private String number;

    @ApiModelProperty("项目名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("项目经理编号")
    @TableField("manager_number")
    private String managerNumber;

    @ApiModelProperty("项目经理")
    @TableField("manager_name")
    private String managerName;

    @ApiModelProperty("项目状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("项目备注")
    @TableField("remark")
    private String remark;

    @TableField("parent_number")
    private String parentNumber;

    @ApiModelProperty("删除状态")
    @TableField("deleted")
    @TableLogic
    private Integer deleted;
}
