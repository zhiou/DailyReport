package com.es.daily_report.vo;

import com.es.daily_report.enums.Roles;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewStaffVO {
    @JsonProperty("staff_number")
    private String staffNumber;

    @JsonProperty("department_id")
    private String departmentId;

    private String name;

    @JsonProperty("default_password")
    private String defaultPassword;

    @JsonProperty("role")
    private Roles role;
}
