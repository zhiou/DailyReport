package com.es.daily_report.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProjectState {
    ACTIVE(0, "激活"),
    COMPLETE(1, "结项"),
    SUSPEND(2, "暂停"),
    CANCEL(3, "取消");

    @EnumValue
    @JsonValue
    private final Integer value;

    private final String desc;

    ProjectState(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
