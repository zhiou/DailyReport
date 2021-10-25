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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "project")
public class Product {
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String number;

    private String name;

    private String inLine;

    @TableLogic
    @JsonIgnore
    private Boolean deleted;
}
