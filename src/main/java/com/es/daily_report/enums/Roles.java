package com.es.daily_report.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Roles {
    ADMIN(1, "admin"),
    PMO(2, "pmo"),
    MANAGER(3, "manager"),
    STAFF(4, "staff");

    @EnumValue
    @JsonValue
    private final Integer code;

    private final String name;

    public Integer getValue() {
        return code;
    }

    public String getName() {
        return name;
    }

    Roles(int value, String desc) {
        this.code = value;
        this.name = desc;
    }
}
