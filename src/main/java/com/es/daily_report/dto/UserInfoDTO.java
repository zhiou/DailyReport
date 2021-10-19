package com.es.daily_report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDTO {
    private int userid ;               //用户id
    private String subcompanyid1;    //分部
    private String departmentid;   //部门
    private String subcompanyname;
    private String departmentname;
    private String subcompanycode;
    private String departmentcode;
    private String workcode;       //编号
    private String lastname;       //姓名
    private String loginid;        //系统账号
    private String password;       //密码
    private String seclevel;        //安全级别
    private String sex;            //性别
    private String jobtitle;       //岗位
    private String managerid;      //直接上级
    private String assistantid;    //助理
    private String status;         //状态  eg:正式、试用等
    private String telephone;      //办公电话
    private String mobile;         //移动电话
    private String mobilecall;     //其他电话
    private String fax;            //传真
    private String email;          //电子邮件
    private String systemlanguage;//系统语言  默认7
    private String birthday;       //生日
    private String folk;           //名族
    private String nativeplace;     //籍贯
    private String regresidentplace; //户口
    private String certificatenum;  //身份证号
    private String maritalstatus;   //婚姻状况
    private String policy;          //政治面貌
    private String bememberdate;    //入团日期
    private String bepartydate;     //入党日期
    private String islabouunion;    //是否是工会会员
    private String educationlevel;  //学历
    private String degree;           //学位
    private String healthinfo;       //健康状况
    private String height;           //身高
    private String weight;          //体重
    private String residentplace;    //居住地
    private String homeaddress;    //家庭住址
    private String startdate = "" ;    //合同开始日期
    private String enddate = "" ;      //合同结束日期
    private String createdate="";       //创建日期
    private String lastChangdate="";    //最后修改日期
    private int accounttype;            //账号类型
    private String dsporder;               //显示顺序
}
