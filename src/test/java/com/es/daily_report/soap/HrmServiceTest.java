/**
 * HrmServiceTest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:19 HST)
 */
package com.es.daily_report.soap;

/*
 *  HrmServiceTest Junit test case
 */

public class HrmServiceTest extends junit.framework.TestCase {


  /** Auto generated test method */
  public void testcheckUser() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
        new com.es.daily_report.soap
            .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.CheckUser checkUser30 =
        (com.es.daily_report.soap.HrmServiceStub.CheckUser)
            getTestObject(com.es.daily_report.soap.HrmServiceStub.CheckUser.class);
    checkUser30.setIn0("192.168.0.127");
    checkUser30.setIn1("ES0092");
    checkUser30.setIn2("2");
    HrmServiceStub.CheckUserResponse response = stub.checkUser(checkUser30);
    Boolean exist = response.getOut();
    assertNotNull(response);
  }

  /** Auto generated test method */
  public void testchangeUserPassword() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
            new com.es.daily_report.soap
                    .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.ChangeUserPassword changeUserPassword42 =
            (com.es.daily_report.soap.HrmServiceStub.ChangeUserPassword)
                    getTestObject(com.es.daily_report.soap.HrmServiceStub.ChangeUserPassword.class);
    changeUserPassword42.setIn0("192.168.0.127");
    changeUserPassword42.setIn1("ES0092");
    changeUserPassword42.setIn2("3");
    assertNotNull(stub.changeUserPassword(changeUserPassword42));
  }

  /** Auto generated test method */
  public void testgetHrmSubcompanyInfoXML() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
            new com.es.daily_report.soap
                    .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.GetHrmSubcompanyInfoXML getHrmSubcompanyInfoXML34 =
            (com.es.daily_report.soap.HrmServiceStub.GetHrmSubcompanyInfoXML)
                    getTestObject(com.es.daily_report.soap.HrmServiceStub.GetHrmSubcompanyInfoXML.class);
    getHrmSubcompanyInfoXML34.setIn0("192.168.0.127");
    String companyXml = stub.getHrmSubcompanyInfoXML(getHrmSubcompanyInfoXML34).getOut();
    assertNotNull(companyXml);
  }

  /** Auto generated test method */
  public void testgetHrmUserInfoXML() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
        new com.es.daily_report.soap
            .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.GetHrmUserInfoXML getHrmUserInfoXML36 =
        (com.es.daily_report.soap.HrmServiceStub.GetHrmUserInfoXML)
            getTestObject(com.es.daily_report.soap.HrmServiceStub.GetHrmUserInfoXML.class);
    getHrmUserInfoXML36.setIn0("192.168.0.127");
    getHrmUserInfoXML36.setIn2("6");
    String userInfoXml = stub.getHrmUserInfoXML(getHrmUserInfoXML36).getOut();
    assertNotNull(userInfoXml);
  }

  /** Auto generated test method */
  public void testgetHrmDepartmentInfoXML() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
        new com.es.daily_report.soap
            .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.GetHrmDepartmentInfoXML getHrmDepartmentInfoXML40 =
        (com.es.daily_report.soap.HrmServiceStub.GetHrmDepartmentInfoXML)
            getTestObject(com.es.daily_report.soap.HrmServiceStub.GetHrmDepartmentInfoXML.class);
    getHrmDepartmentInfoXML40.setIn0("192.168.0.127");
    getHrmDepartmentInfoXML40.setIn1("6");
    String response = stub.getHrmDepartmentInfoXML(getHrmDepartmentInfoXML40).getOut();
    assertNotNull(response);
  }

  /** Auto generated test method */
  public void testgetHrmJobTitleInfoXML() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
        new com.es.daily_report.soap
            .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.GetHrmJobTitleInfoXML getHrmJobTitleInfoXML44 =
        (com.es.daily_report.soap.HrmServiceStub.GetHrmJobTitleInfoXML)
            getTestObject(com.es.daily_report.soap.HrmServiceStub.GetHrmJobTitleInfoXML.class);
    getHrmJobTitleInfoXML44.setIn0("192.168.0.127");
    getHrmJobTitleInfoXML44.setIn1("6");
    String response = stub.getHrmJobTitleInfoXML(getHrmJobTitleInfoXML44).getOut();
    assertNotNull(response);
  }

  /** Auto generated test method */
  public void testgetHrmSubcompanyInfo() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
            new com.es.daily_report.soap
                    .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.GetHrmSubcompanyInfo getHrmSubcompanyInfo50 =
            (com.es.daily_report.soap.HrmServiceStub.GetHrmSubcompanyInfo)
                    getTestObject(com.es.daily_report.soap.HrmServiceStub.GetHrmSubcompanyInfo.class);
    getHrmSubcompanyInfo50.setIn0("192.168.0.127");

    HrmServiceStub.SubCompanyBean[] response = stub.getHrmSubcompanyInfo(getHrmSubcompanyInfo50).getOut().getSubCompanyBean();
    assertNotNull(response);
  }


  /** Auto generated test method */
  public void testgetHrmDepartmentInfo() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
            new com.es.daily_report.soap
                    .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.GetHrmDepartmentInfo getHrmDepartmentInfo32 =
            (com.es.daily_report.soap.HrmServiceStub.GetHrmDepartmentInfo)
                    getTestObject(com.es.daily_report.soap.HrmServiceStub.GetHrmDepartmentInfo.class);
    getHrmDepartmentInfo32.setIn0("192.168.0.127");
    getHrmDepartmentInfo32.setIn1("1");
    HrmServiceStub.DepartmentBean[] response = stub.getHrmDepartmentInfo(getHrmDepartmentInfo32).getOut().getDepartmentBean();
    assertNotNull(response);
  }

  /** Auto generated test method */
  public void testgetHrmJobTitleInfo() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
        new com.es.daily_report.soap
            .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.GetHrmJobTitleInfo getHrmJobTitleInfo48 =
        (com.es.daily_report.soap.HrmServiceStub.GetHrmJobTitleInfo)
            getTestObject(com.es.daily_report.soap.HrmServiceStub.GetHrmJobTitleInfo.class);
    getHrmJobTitleInfo48.setIn0("192.168.0.127");
    getHrmJobTitleInfo48.setIn1("1");
    HrmServiceStub.JobTitleBean[] response = stub.getHrmJobTitleInfo(getHrmJobTitleInfo48).getOut().getJobTitleBean();
    assertNotNull(response);
  }


  /** Auto generated test method */
  public void testgetHrmUserInfo() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
        new com.es.daily_report.soap
            .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.GetHrmUserInfo getHrmUserInfo52 =
        (com.es.daily_report.soap.HrmServiceStub.GetHrmUserInfo)
            getTestObject(com.es.daily_report.soap.HrmServiceStub.GetHrmUserInfo.class);
    getHrmUserInfo52.setIn0("192.168.0.127");
    getHrmUserInfo52.setIn1("ES0092");
    HrmServiceStub.UserBean[] response = stub.getHrmUserInfo(getHrmUserInfo52).getOut().getUserBean();
    assertNotNull(response);
  }


  /** Auto generated test method */
  public void testsynSubCompany() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
            new com.es.daily_report.soap
                    .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.SynSubCompany synSubCompany46 =
            (com.es.daily_report.soap.HrmServiceStub.SynSubCompany)
                    getTestObject(com.es.daily_report.soap.HrmServiceStub.SynSubCompany.class);
    synSubCompany46.setIn0("192.168.0.127");
    synSubCompany46.setIn1("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<root>\n" +
            "  <orglist>\n" +
            "     <org action=\"add\">\n" +
            "        <code>001</code>\n" +
            "        <shortname>???????????????</shortname>\n" +
            "        <fullname>???????????????</fullname>\n" +
            "    <org_code>???????????????</org_code>\n" +
            "        <parent_code>0</parent_code>\n" +
            "    <canceled>0</canceled>\n" +
            "        <order>0</order>\n" +
            "     </org>\n" +
            "     <org action=\"edit\">\n" +
            "        <code>002</code>\n" +
            "        <shortname>???????????????</shortname>\n" +
            "        <fullname>???????????????</fullname>\n" +
            "    <org_code>???????????????</org_code>\n" +
            "        <parent_code>0</parent_code>\n" +
            "    <canceled>0</canceled>\n" +
            "        <order>0</order>\n" +
            "     </org>\n" +
            "     <org action=\"delete\">\n" +
            "        <code>003</code>\n" +
            "        <shortname>???????????????</shortname>\n" +
            "        <canceled>0</canceled>\n" +
            "     </org>\n" +
            "  </orglist>\n" +
            "</root>");
    String response = stub.synSubCompany(synSubCompany46).getOut();
    assertNotNull(response);
  }

  /** Auto generated test method */
  public void testsynDepartment() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
            new com.es.daily_report.soap
                    .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.SynDepartment synDepartment54 =
            (com.es.daily_report.soap.HrmServiceStub.SynDepartment)
                    getTestObject(com.es.daily_report.soap.HrmServiceStub.SynDepartment.class);
    synDepartment54.setIn0("192.168.0.127");
    synDepartment54.setIn1("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<root>\n" +
            "  <orglist>\n" +
            "     <org action=\"add\">\n" +
            "        <code>001</code>\n" +
            "        <shortname>???????????????</shortname>\n" +
            "        <fullname>???????????????</fullname>\n" +
            "    <org_code>003</org_code>\n" +
            "        <parent_code>0</parent_code>\n" +
            "    <canceled>0</canceled>\n" +
            "        <order>0</order>\n" +
            "     </org>\n" +
            "     <org action=\"edit\">\n" +
            "        <code>002</code>\n" +
            "        <shortname>???????????????</shortname>\n" +
            "        <fullname>???????????????</fullname>\n" +
            "    <org_code>003</org_code>\n" +
            "        <parent_code>0</parent_code>\n" +
            "    <canceled>0</canceled>\n" +
            "        <order>0</order>\n" +
            "     </org>\n" +
            "    <org action=\"delete\">\n" +
            "        <code>003</code>\n" +
            "    <shortname>???????????????</shortname>\n" +
            "    <org_code>003</org_code>\n" +
            "        <canceled>0</canceled>\n" +
            "     </org>\n" +
            "  </orglist>\n" +
            "</root>");
    String response = stub.synDepartment(synDepartment54).getOut();
    assertNotNull(response);
  }

  /** Auto generated test method */
  public void testsynJobtitle() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
            new com.es.daily_report.soap
                    .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.SynJobtitle synJobtitle38 =
            (com.es.daily_report.soap.HrmServiceStub.SynJobtitle)
                    getTestObject(com.es.daily_report.soap.HrmServiceStub.SynJobtitle.class);
    synJobtitle38.setIn0("192.168.0.127");
    synJobtitle38.setIn1("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<root>\n" +
            "  <jobtitlelist>\n" +
            "     <jobtitle action=\"add\">\n" +
            "        <jobtitlecode>00001</jobtitlecode>\n" +
            "        <jobtitlename>???????????????</jobtitlename>\n" +
            "        <jobtitleremark>???????????????</jobtitleremark>\n" +
            "        <jobtitledept>0001</jobtitledept>\n" +
            "     </jobtitle>\n" +
            "     <jobtitle action=\"edit\">\n" +
            "        <jobtitlecode>00002</jobtitlecode>\n" +
            "        <jobtitlename>???????????????</jobtitlename>\n" +
            "        <jobtitleremark>???????????????</jobtitleremark>\n" +
            "        <jobtitledept>0002</jobtitledept>\n" +
            "     </jobtitle>\n" +
            "     <jobtitle action=\"delete\">\n" +
            "        <jobtitlecode>00003</jobtitlecode>\n" +
            "        <jobtitlename>???????????????</jobtitlename>\n" +
            "     </jobtitle>\n" +
            "  </jobtitlelist>\n" +
            "</root>");
    String response = stub.synJobtitle(synJobtitle38).getOut();
    assertNotNull(response);
  }


  /** Auto generated test method */
  public void testsynHrmResource() throws java.lang.Exception {

    com.es.daily_report.soap.HrmServiceStub stub =
            new com.es.daily_report.soap
                    .HrmServiceStub(); // the default implementation should point to the right endpoint

    com.es.daily_report.soap.HrmServiceStub.SynHrmResource synHrmResource28 =
            (com.es.daily_report.soap.HrmServiceStub.SynHrmResource)
                    getTestObject(com.es.daily_report.soap.HrmServiceStub.SynHrmResource.class);
    synHrmResource28.setIn0("192.168.0.127");
    synHrmResource28.setIn1("<?xml version='1.0' encoding='UTF-8'?>\n" +
            "<root>\n" +
            "\t<hrmlist>\n" +
            "\t\t<hrm action='add'>\n" +
            "\t\t\t<workcode>ES8888</workcode>\n" +
            "\t\t\t<subcompany>????????????>???????????????</subcompany>\n" +
            "\t\t\t<department>????????????>???????????????</department>\n" +
            "\t\t\t<lastname>??????</lastname>\n" +
            "\t\t\t<loginid>test</loginid>\n" +
            "\t\t\t<password>test</password>\n" +
            "\t\t\t<seclevel>100</seclevel>\n" +
            "\t\t\t<sex>???</sex>\n" +
            "\t\t\t<jobtitle>????????????</jobtitle>\n" +
            "\t\t\t<jobactivityid>??????</jobactivityid>\n" +
            "\t\t\t<jobgroupid>????????????</jobgroupid>\n" +
            "\t\t\t<jobcall>??????</jobcall>\n" +
            "\t\t\t<joblevel>1</joblevel>\n" +
            "\t\t\t<jobactivitydesc>?????????????????????</jobactivitydesc>\n" +
            "\t\t\t<managerid>ES0092</managerid>\n" +
            "\t\t\t<assistantid>ES0092</assistantid>\n" +
            "\t\t\t<status>??????</status>\n" +
            "\t\t\t<locationid>??????</locationid>\n" +
            "\t\t\t<workroom>??????</workroom>\n" +
            "\t\t\t<telephone>55667788</telephone>\n" +
            "\t\t\t<mobile>13924202046</mobile>\n" +
            "\t\t\t<mobilecall>55443322</mobilecall>\n" +
            "\t\t\t<fax>000-22222222</fax>\n" +
            "\t\t\t<email>1@1.com</email>\n" +
            "\t\t\t<systemlanguage>????????????</systemlanguage>\n" +
            "\t\t\t<birthday>1990-01-01</birthday>\n" +
            "\t\t\t<folk>???</folk>\n" +
            "\t\t\t<nativeplace>??????</nativeplace>\n" +
            "\t\t\t<regresidentplace>??????</regresidentplace>\n" +
            "\t\t\t<certificatenum>420881199407015812</certificatenum>\n" +
            "\t\t\t<maritalstatus>??????</maritalstatus>\n" +
            "\t\t\t<policy>???</policy>\n" +
            "\t\t\t<bememberdate>1990-01-01</bememberdate>\n" +
            "\t\t\t<bepartydate>1990-01-01</bepartydate>\n" +
            "\t\t\t<islabouunion>????????????</islabouunion>\n" +
            "\t\t\t<educationlevel>??????</educationlevel>\n" +
            "\t\t\t<degree>??????</degree>\n" +
            "\t\t\t<healthinfo>??????</healthinfo>\n" +
            "<height>??????</height>\n" +
            "<weight>??????</weight>\n" +
            "\t\t\t<residentplace>??????????????????</residentplace>\n" +
            "\t\t\t<homeaddress>??????????????????XX???</homeaddress>\n" +
            "\t\t\t<tempresidentnumber>???</tempresidentnumber>\n" +
            "\t\t</hrm>\n" +
            "\t\t<hrm action='edit'>\n" +
            "\t\t\t<workcode>ES8888</workcode>\n" +
            "\t\t\t<subcompany>????????????</subcompany>\n" +
            "\t\t\t<department>????????????</department>\n" +
            "\t\t\t<lastname>??????</lastname>\n" +
            "\t\t\t<loginid>test1</loginid>\n" +
            "\t\t\t<password>test1</password>\n" +
            "\t\t\t<seclevel>100</seclevel>\n" +
            "\t\t\t<sex>???</sex>\n" +
            "\t\t\t<jobtitle>????????????</jobtitle>\n" +
            "\t\t\t<jobactivityid>??????</jobactivityid>\n" +
            "\t\t\t<jobgroupid>????????????</jobgroupid>\n" +
            "\t\t\t<jobcall>??????</jobcall>\n" +
            "\t\t\t<joblevel>1</joblevel>\n" +
            "\t\t\t<jobactivitydesc>?????????????????????</jobactivitydesc>\n" +
            "\t\t\t<managerid>A000858</managerid>\n" +
            "\t\t\t<assistantid>A000858</assistantid>\n" +
            "\t\t\t<status>??????</status>\n" +
            "\t\t\t<locationid>??????</locationid>\n" +
            "\t\t\t<workroom>??????</workroom>\n" +
            "\t\t\t<telephone>55667788</telephone>\n" +
            "\t\t\t<mobile>13924202046</mobile>\n" +
            "\t\t\t<mobilecall>55443322</mobilecall>\n" +
            "\t\t\t<fax>000-22222222</fax>\n" +
            "\t\t\t<email>1@1.com</email>\n" +
            "\t\t\t<systemlanguage>????????????</systemlanguage>\n" +
            "\t\t\t<birthday>1990-01-01</birthday>\n" +
            "\t\t\t<folk>???</folk>\n" +
            "\t\t\t<nativeplace>??????</nativeplace>\n" +
            "\t\t\t<regresidentplace>??????</regresidentplace>\n" +
            "\t\t\t<certificatenum>420881199407015812</certificatenum>\n" +
            "\t\t\t<maritalstatus>??????</maritalstatus>\n" +
            "\t\t\t<policy>???</policy>\n" +
            "\t\t\t<bememberdate>1990-01-01</bememberdate>\n" +
            "\t\t\t<bepartydate>1990-01-01</bepartydate>\n" +
            "\t\t\t<islabouunion>????????????</islabouunion>\n" +
            "\t\t\t<educationlevel>??????</educationlevel>\n" +
            "\t\t\t<degree>??????</degree>\n" +
            "\t\t\t<healthinfo>??????</healthinfo>\n" +
            "<height>??????</height>\n" +
            "<weight>??????</weight>\n" +
            "\t\t\t<residentplace>??????????????????</residentplace>\n" +
            "\t\t\t<homeaddress>??????????????????XX???</homeaddress>\n" +
            "\t\t\t<tempresidentnumber>???</tempresidentnumber>\n" +
            "\t\t</hrm>\n" +
            "\t</hrmlist>\n" +
            "</root>");
    String response = stub.synHrmResource(synHrmResource28).getOut();
    assertNotNull(response);
  }

  // Create an ADBBean and provide it as the test object
  public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type)
      throws java.lang.Exception {
    return (org.apache.axis2.databinding.ADBBean) type.newInstance();
  }
}
