package com.es.daily_report.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.es.daily_report.enums.ProjectState;
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
@TableName(value = "project")
public class Project {
    @JsonIgnore
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String number;

    private String name;

    @JsonProperty("manager_number")
    private String managerNumber;

    private ProjectState status;

    @TableLogic
    @JsonIgnore
    private Boolean deleted;
}
