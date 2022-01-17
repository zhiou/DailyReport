package com.es.daily_report.vo;

import com.es.daily_report.enums.ProjectState;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectVO {
    private String number;

    private String name;

    @JsonProperty("manager_number")
    private String managerNumber;

    @JsonProperty("manager_name")
    private String managerName;

    private ProjectState status;

    private String remark;

    @JsonProperty("parent_number")
    private String parentNumber;

    @JsonProperty("key")
    public String getKey() {
        return number;
    }

    @JsonProperty("value")
    public String getValue() { return number; }

    @JsonProperty("label")
    public String getLabel() { return name; }

    @Nullable
    private List<ProjectVO> children = new ArrayList<>();
}
