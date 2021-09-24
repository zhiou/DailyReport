package com.es.daily_report.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReportStatus {
    SAVED(0, "已保存"),
    COMMITTED(1, "已提交");

    @EnumValue
    @JsonValue
    private final Integer value;

    private final String desc;

    ReportStatus(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
