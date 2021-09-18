package com.es.daily_report.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "auth")
public class Auth {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @JsonProperty("user_id")
    private String userId;

    private String type;

    private String credential;

    private String salt;

    @TableLogic
    @JsonIgnore
    private Integer deleted;
}
