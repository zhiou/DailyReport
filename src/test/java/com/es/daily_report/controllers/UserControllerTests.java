package com.es.daily_report.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@MapperScan("com.es.daily_report.mapper")
@ComponentScan("com.es.daily_report")
@SpringBootTest()
@AutoConfigureMockMvc
public class UserControllerTests {
    @Autowired
    private MockMvc mvc;

    @Autowired
    private TestUtils testUtils;

    @Before
    public void setUp() throws Exception {
        testUtils.login("ES0092", "2");
    }

    @After
    public void cleanUp() throws Exception {
        testUtils.logout();
    }

    @Test
    @Transactional
    @Rollback
    //现在是调用OA的接口，所以Rollback无法还原密码了
    public void modifyAdminPassword() throws Exception {
        testUtils.modify("2", "3");
        testUtils.login("ES0092", "3");
        testUtils.modify("3", "2");
    }

}
