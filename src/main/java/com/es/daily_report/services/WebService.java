package com.es.daily_report.services;

import com.es.daily_report.dto.UserInfoDTO;
import com.es.daily_report.soap.HrmServiceStub;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.apache.axis2.AxisFault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

@Service
public class WebService {
    private HrmServiceStub stub = null; // the default implementation should point to the right endpoint

    XmlMapper xmlMapper = new XmlMapper();

    @Value("${webservice.client.ip}")
    private String ip;

    public WebService() throws AxisFault {
        stub = new HrmServiceStub();
    }

    public Boolean check(String username, String password) {
        HrmServiceStub.CheckUser checkUserParam = new HrmServiceStub.CheckUser();
        checkUserParam.setIn0(ip);
        checkUserParam.setIn1(username);
        checkUserParam.setIn2(password);
        HrmServiceStub.CheckUserResponse response = null;
        try {
            response = stub.checkUser(checkUserParam);
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
            response = stub.changeUserPassword(changePasswordParam);
            if (response != null) {
                return response.getOut();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return false;
    }

    public UserInfoDTO getUserInfoByNumber(String workNumber) {
        HrmServiceStub.GetHrmUserInfoXML getHrmUserInfoParam =
                new HrmServiceStub.GetHrmUserInfoXML();
        // TODO : Fill in the getHrmUserInfoXML36 here
        getHrmUserInfoParam.setIn0(ip);
        getHrmUserInfoParam.setIn1(workNumber);
        try {
            String userInfoXml = stub.getHrmUserInfoXML(getHrmUserInfoParam).getOut();
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
}
