package com.es.daily_report.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleVO {
    @JsonProperty("work_code")
    private String workCode;

    @JsonProperty("role_name")
    private String roleName;
}
