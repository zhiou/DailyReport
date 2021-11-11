package com.es.daily_report.vo;

import com.es.daily_report.enums.ProjectState;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectVO {
    private String number;

    private String name;

    @JsonProperty("manager_number")
    private String managerNumber;

    @JsonProperty("manager_name")
    private String managerName;

    private ProjectState status;

    private String remark;
}
