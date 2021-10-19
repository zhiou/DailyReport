package com.es.daily_report.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
public class LoginVO {
    @NotBlank(message = "用户名不能为空")
    private String account;

    // 需要允许admin密码通过
    @NotBlank(message = "密码不能为空")
    private String password;
}
