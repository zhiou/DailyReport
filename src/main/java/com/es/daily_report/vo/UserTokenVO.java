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
public class UserTokenVO {
    @JsonProperty("account")
    private String account;

    @JsonProperty("role")
    private String roleName;

    @JsonProperty("token")
    private String token;

    private String name;

    private String department;
}
