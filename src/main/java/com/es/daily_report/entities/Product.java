package com.es.daily_report.entities;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("产品编号")
    @TableField("number")
    private String number;

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

    @JsonProperty("key")
    public String getKey() {
        return number;
    }

    @ApiModelProperty("删除状态")
    @TableField("deleted")
    @TableLogic
    private Integer deleted;
}
