package com.es.daily_report.services;

import com.es.daily_report.dto.DepartmentInfoDTO;
import com.es.daily_report.dto.JobTitleInfoDTO;
import com.es.daily_report.dto.UserInfoDTO;
import com.es.daily_report.soap.HrmServiceStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis2.AxisFault;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

@Slf4j
@Service
public class WebService {
    private HrmServiceStub hrmStub;
    XmlMapper xmlMapper = new XmlMapper();

    private String ip = System.getenv("NODE_IP");

    public WebService() throws AxisFault {
        hrmStub = new HrmServiceStub();
        log.info("web service client ip", ip);
    }

    public Boolean check(String username, String password) {
        HrmServiceStub.CheckUser checkUserParam = new HrmServiceStub.CheckUser();
        checkUserParam.setIn0(ip);
        checkUserParam.setIn1(username);
        checkUserParam.setIn2(password);
        HrmServiceStub.CheckUserResponse response = null;
        try {
            response = hrmStub.checkUser(checkUserParam);
            if (response != null) {
                return response.getOut();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean changePassword(String username, String newPassword) {
        HrmServiceStub.ChangeUserPassword changePasswordParam = new HrmServiceStub.ChangeUserPassword();
        changePasswordParam.setIn0(ip);
        changePasswordParam.setIn1(username);
        changePasswordParam.setIn2(newPassword);
        HrmServiceStub.ChangeUserPasswordResponse response = null;
        try {
            response = hrmStub.changeUserPassword(changePasswordParam);
            if (response != null) {
                return response.getOut();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return false;
    }

    public UserInfoDTO getUserInfoByWorkCode(String workNumber) {
        HrmServiceStub.GetHrmUserInfoXML getHrmUserInfoParam =
                new HrmServiceStub.GetHrmUserInfoXML();
        getHrmUserInfoParam.setIn0(ip);
        getHrmUserInfoParam.setIn1(workNumber);
        try {
            String userInfoXml = hrmStub.getHrmUserInfoXML(getHrmUserInfoParam).getOut();
            if (userInfoXml != null) {
                UserInfoDTO[] result = xmlMapper.readValue(userInfoXml, UserInfoDTO[].class);
                if (result.length > 0) {
                    return result[0];
                }
            }
        } catch (RemoteException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserInfoDTO[] getUserInfoByCompany(String companyId) {
        HrmServiceStub.GetHrmUserInfoXML getHrmUserInfoParam =
                new HrmServiceStub.GetHrmUserInfoXML();
        getHrmUserInfoParam.setIn0(ip);
        getHrmUserInfoParam.setIn2(companyId);
        try {
            String userInfoXml = hrmStub.getHrmUserInfoXML(getHrmUserInfoParam).getOut();
            if (userInfoXml != null) {
                return xmlMapper.readValue(userInfoXml, UserInfoDTO[].class);
            }
        } catch (RemoteException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserInfoDTO[] getUserInfoByDepartmentId(String departmentId) {
        HrmServiceStub.GetHrmUserInfoXML getHrmUserInfoParam =
                new HrmServiceStub.GetHrmUserInfoXML();
        getHrmUserInfoParam.setIn0(ip);
        getHrmUserInfoParam.setIn3(departmentId);
        try {
            String userInfoXml = hrmStub.getHrmUserInfoXML(getHrmUserInfoParam).getOut();
            if (userInfoXml != null) {
                return xmlMapper.readValue(userInfoXml, UserInfoDTO[].class);
            }
        } catch (RemoteException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserInfoDTO[] getUserInfoByJobTitleId(String jobTitleId) {
        HrmServiceStub.GetHrmUserInfoXML getHrmUserInfoParam =
                new HrmServiceStub.GetHrmUserInfoXML();
        getHrmUserInfoParam.setIn0(ip);
        getHrmUserInfoParam.setIn4(jobTitleId);
        try {
            String userInfoXml = hrmStub.getHrmUserInfoXML(getHrmUserInfoParam).getOut();
            if (userInfoXml != null) {
                return xmlMapper.readValue(userInfoXml, UserInfoDTO[].class);
            }
        } catch (RemoteException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public DepartmentInfoDTO[] getDepartmentInfo() {
        HrmServiceStub.GetHrmDepartmentInfoXML getHrmDepartmentInfoParam = new HrmServiceStub.GetHrmDepartmentInfoXML();
        getHrmDepartmentInfoParam.setIn0(ip);
        // 文鼎创公司ID为6， 深圳总公司为1， 北京分公司为5
        getHrmDepartmentInfoParam.setIn1("6");
        try {
            String departmentInfoXml = hrmStub.getHrmDepartmentInfoXML(getHrmDepartmentInfoParam).getOut();
            if (departmentInfoXml != null) {
                return xmlMapper.readValue(departmentInfoXml, DepartmentInfoDTO[].class);
            }
        } catch (RemoteException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JobTitleInfoDTO[] getJobTitleInfo() {
        HrmServiceStub.GetHrmJobTitleInfoXML getJobTitleInfoParam = new HrmServiceStub.GetHrmJobTitleInfoXML();
        getJobTitleInfoParam.setIn0(ip);
        // 文鼎创公司ID为6， 深圳总公司为1， 北京分公司为5
        getJobTitleInfoParam.setIn1("6");

        try {
            String getHrmJobTitleInfoXML = hrmStub.getHrmJobTitleInfoXML(getJobTitleInfoParam).getOut();
            if (getHrmJobTitleInfoXML != null) {
                return xmlMapper.readValue(getHrmJobTitleInfoXML, JobTitleInfoDTO[].class);
            }
        } catch (RemoteException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JobTitleInfoDTO[] getJobTitleInfoOfDepartment(String departmentId) {
        HrmServiceStub.GetHrmJobTitleInfoXML getJobTitleInfoParam = new HrmServiceStub.GetHrmJobTitleInfoXML();
        getJobTitleInfoParam.setIn0(ip);
        // 文鼎创公司ID为6， 深圳总公司为1， 北京分公司为5
        getJobTitleInfoParam.setIn2(departmentId);

        try {
            String getHrmJobTitleInfoXML = hrmStub.getHrmJobTitleInfoXML(getJobTitleInfoParam).getOut();
            if (getHrmJobTitleInfoXML != null) {
                return xmlMapper.readValue(getHrmJobTitleInfoXML, JobTitleInfoDTO[].class);
            }
        } catch (RemoteException | JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
