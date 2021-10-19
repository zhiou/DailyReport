package com.es.daily_report.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class PasswordUpdateVO {

    @NotBlank
    String password;

    @NotBlank(message = "密码不能为空")
    @JsonProperty("new_password")
    String newPassword;
}
