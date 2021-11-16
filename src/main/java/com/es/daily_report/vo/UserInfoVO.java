package com.es.daily_report.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoVO {
    @JsonProperty("account")
    private String account;

    @JsonProperty("roles")
    private List<String> roles;

    private String name;

    private String department;

    private List<ProjectVO> projects;
}
