package com.es.daily_report.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserTokenVO {
    @JsonProperty("account")
    private String account;

    @JsonProperty("roles")
    private Set<String> roles;

    @JsonProperty("token")
    private String token;

    private String name;

    private String department;

    private List<ProjectVO> projects;
}
