package com.es.daily_report.controllers;

import com.es.daily_report.enums.ProjectState;
import com.es.daily_report.vo.ProjectRemoveVO;
import com.es.daily_report.vo.ProjectVO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@MapperScan("com.es.daily_report.mapper")
@ComponentScan("com.es.daily_report")
@SpringBootTest()
@AutoConfigureMockMvc
public class ProjectControllerTests {
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
    public void create() throws Exception {
        ProjectVO projectVO = ProjectVO.builder()
                .number("11223344")
                .managerNumber("ES0092")
                .name("某个项目")
                .status(ProjectState.ACTIVE)
                .build();
        testUtils.createProject(projectVO);
    }

    @Test
    @Transactional
    public void query() throws Exception {
        ProjectVO projectVO = ProjectVO.builder()
                .number("11223344")
                .managerNumber("ES0092")
                .name("某个项目")
                .status(ProjectState.ACTIVE)
                .build();
        testUtils.createProject(projectVO);
        testUtils.queryProject("11223344");
        testUtils.queryAllProject();
    }

    @Test
    @Transactional
    public void update() throws Exception {
        ProjectVO projectVO = ProjectVO.builder()
                .number("11223344")
                .managerNumber("ES0092")
                .name("某个项目")
                .status(ProjectState.ACTIVE)
                .build();
        testUtils.createProject(projectVO);
        projectVO.setStatus(ProjectState.COMPLETE);
        projectVO.setName("改了名字");
        testUtils.updateProject(projectVO);
    }

    @Test
    @Transactional
    public void remove() throws Exception {
        ProjectVO projectVO = ProjectVO.builder()
                .number("11223344")
                .managerNumber("ES0092")
                .name("某个项目")
                .status(ProjectState.ACTIVE)
                .build();
        testUtils.createProject(projectVO);
        ProjectVO projectVO1 = ProjectVO.builder()
                .number("223344")
                .managerNumber("ES0092")
                .name("某个项目")
                .status(ProjectState.ACTIVE)
                .build();
        testUtils.createProject(projectVO1);

        String[] numbers = new String[]{"11223344", "223344"};
        ProjectRemoveVO projectRemoveVO = ProjectRemoveVO.builder()
                        .numbers(numbers)
                                .build();
        testUtils.removeProject(projectRemoveVO);
    }
}
