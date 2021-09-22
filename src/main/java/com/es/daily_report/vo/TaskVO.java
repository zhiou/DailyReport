package com.es.daily_report.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskVO {
    private String name;

    private String details;

    private Integer cost;

    @JsonProperty("project_id")
    private String projectId;

    @JsonProperty("product_id")
    private String productId;
}
