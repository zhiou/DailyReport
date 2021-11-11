package com.es.daily_report.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum ProductState {
    ACTIVE(0, "设计"),
    COMPLETE(1, "研发"),
    SUSPEND(2, "发布"),
    CANCEL(3, "终止");

    @EnumValue
    @JsonValue
    private final Integer value;

    private final String desc;

    ProductState(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
