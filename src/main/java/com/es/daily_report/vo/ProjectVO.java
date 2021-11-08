package com.es.daily_report.vo;

import com.es.daily_report.enums.ProjectState;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.util.annotation.Nullable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectVO {
    private String number;

    @Nullable
    private String name;

    @Nullable
    @JsonProperty("manager_number")
    private String managerNumber;

    @Nullable
    private ProjectState status;
}
