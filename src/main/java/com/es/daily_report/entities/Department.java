package com.es.daily_report.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "project")
public class Department {
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String name;

    private String managerId;

    private Integer cost;

    private Date onDay;

    private String productId;

    private String projectId;

    private Date committed;

    @TableLogic
    @JsonIgnore
    private Boolean deleted;
}
