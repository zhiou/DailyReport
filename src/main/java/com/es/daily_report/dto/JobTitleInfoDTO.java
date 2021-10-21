package com.es.daily_report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobTitleInfoDTO {
    private String jobtitleid;
    private String shortname;
    private String fullname;
    private String departmentid;
    private String jobresponsibility;
    private String jobcompetency;
    private String jobdoc;
    private String jobtitleremark;
    private String lastChangdate;
}
