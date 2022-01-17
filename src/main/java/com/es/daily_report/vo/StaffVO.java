package com.es.daily_report.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StaffVO {
    @JsonProperty("work_code")
    private String workCode;

    private String name;

    private String department;

    private Set<String> roles;

    @JsonProperty("key")
    public String getKey() {
        return workCode;
    }

    @JsonProperty("number")
    public String getNumber() {
        return workCode;
    }
}
