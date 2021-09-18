package com.es.daily_report.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StaffState {
    WORKING(0, "上班"),
    VACATION(1, "休假"),
    RESIGN(2, "离职"),
    BUSINESS_TRIP(3, "出差");

    @EnumValue
    @JsonValue
    private final Integer value;

    private final String desc;

    StaffState(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
