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
 * @since 2021-12-01
 */
@Getter
@Setter
@TableName("user_role")
@ApiModel(value = "UserRole对象", description = "")
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("角色ID")
    @TableField("role_id")
    private Long roleId;

    @ApiModelProperty("系统用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("删除状态 0: 未删除 1: 已删除")
    @TableField("deleted")
    @TableLogic
    private Integer deleted;


}
