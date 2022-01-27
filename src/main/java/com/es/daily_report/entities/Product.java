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
@TableName("product")
@ApiModel(value = "Product对象", description = "")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("产品编号")
    @TableId(value = "number", type =  IdType.ASSIGN_ID)
    private String number;

    @ApiModelProperty("产品型号")
    @TableField("model")
    private String model;

    @ApiModelProperty("产品名")
    @TableField("name")
    private String name;

    @ApiModelProperty("产品线名")
    @TableField("in_line")
    private String inLine;

    @ApiModelProperty("产品状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("产品备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("删除状态")
    @TableField("deleted")
    @TableLogic
    private Integer deleted;
}
