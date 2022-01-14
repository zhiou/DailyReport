package com.es.daily_report.vo;

import com.es.daily_report.enums.ProjectState;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Nullable
    private List<ProjectVO> sublist = new ArrayList<>();
}
