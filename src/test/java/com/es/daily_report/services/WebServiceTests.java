package com.es.daily_report.services;

import com.es.daily_report.dto.DepartmentInfoDTO;
import com.es.daily_report.dto.JobTitleInfoDTO;
import com.es.daily_report.dto.UserInfoDTO;
import org.apache.axis2.AxisFault;
import org.junit.Test;

public class WebServiceTests extends junit.framework.TestCase {


    public void testGetDepartmentInfo() throws AxisFault {
        WebService webService = new WebService();
        DepartmentInfoDTO[] departmentInfoDTO = webService.getDepartmentInfo();
        assertNotNull(departmentInfoDTO);
    }

    public void testGetUserInfoByWorkCode() throws AxisFault {
        WebService webService = new WebService();
        UserInfoDTO userInfoDTO = webService.getUserInfoByWorkCode("ES0092");
        assertNotNull(userInfoDTO);
    }

    public void testGetUserInfoByDepartment() throws AxisFault {
        WebService webService = new WebService();
        UserInfoDTO[] userInfoDTO = webService.getUserInfoByDepartmentId("103");
        assertNotNull(userInfoDTO);
    }

    public void testGetJobTitleOfCompany() throws AxisFault {
        WebService webService = new WebService();
        JobTitleInfoDTO[] jobTitles = webService.getJobTitleInfo();
        assertNotNull(jobTitles);
    }

    public void testGetJobTitleOfDepartment() throws AxisFault {
        WebService webService = new WebService();
        JobTitleInfoDTO[] jobTitles = webService.getJobTitleInfoOfDepartment("103");
        assertNotNull(jobTitles);
    }

    public void testGetProjectInfo() throws AxisFault {
//        WebService webService = new WebService();
//        webService.getProjectInfo();

    }

    public void testGetEnv() throws AxisFault {
        String env = System.getProperty("ALIYUN_DOCKER_USER");
        System.out.println(env);
    }
}
