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
public class DepartmentVO {
    @JsonProperty("department_id")
    private String departmentId;

    @JsonProperty("department_name")
    private String department;
}
