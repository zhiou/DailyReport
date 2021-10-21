package com.es.daily_report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentInfoDTO {
    private String departmentid;
    private String shortname;
    private String fullname;
    private String subcompanyid;
    private String supdepartmentid;
    private String showorder;
    private String code;
    private String action;
    private String lastChangdate;
    private int canceled;
}
