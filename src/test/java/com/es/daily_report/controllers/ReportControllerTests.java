package com.es.daily_report.controllers;

import com.es.daily_report.enums.ReportStatus;
import com.es.daily_report.vo.ReportVO;
import com.es.daily_report.vo.TaskVO;
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@MapperScan("com.es.daily_report.mapper")
@ComponentScan("com.es.daily_report")
@SpringBootTest()
@AutoConfigureMockMvc
public class ReportControllerTests {
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
    public void create() throws Exception {
        TaskVO taskVO = TaskVO.builder()
                .name("某个任务")
                .details("就是完成了这个任务呗")
                .cost(6)
                .build();
        List<TaskVO> taskVOList = new ArrayList<>();
        taskVOList.add(taskVO);
        ReportVO reportVO = ReportVO.builder()
                        .onDay(new Date())
                        .status(ReportStatus.COMMITTED)
                        .tasks(taskVOList)
                        .build();
        testUtils.report(reportVO);
    }

    @Test
    @Transactional
    @Rollback
    public void query() throws Exception {
        TaskVO taskVO = TaskVO.builder()
                .name("某个任务")
                .details("就是完成了这个任务呗")
                .cost(6)
                .build();
        List<TaskVO> taskVOList = new ArrayList<>();
        taskVOList.add(taskVO);
        ReportVO reportVO = ReportVO.builder()
                .onDay(new Date())
                .tasks(taskVOList)
                .build();
        testUtils.report(reportVO);
        testUtils.getReport();
    }

    @Test
    @Transactional
    @Rollback
    public void queryDepartment() throws Exception {

        TaskVO taskVO1 = TaskVO.builder()
                .name("task of zhang san")
                .details("still working on it")
                .cost(6)
                .build();
        List<TaskVO> taskVOList1 = new ArrayList<>();
        taskVOList1.add(taskVO1);
        testUtils.report(ReportVO.builder()
                .onDay(new Date())
                .tasks(taskVOList1)
                .build());

        TaskVO taskVO2 = TaskVO.builder()
                .name("task of li si")
                .details("finished")
                .cost(6)
                .build();
        List<TaskVO> taskVOList2 = new ArrayList<>();
        taskVOList2.add(taskVO2);
        testUtils.report(ReportVO.builder()
                .onDay(new Date())
                .tasks(taskVOList2)
                .build());
        testUtils.getReportsOfDepartment();
    }
}
