package com.es.daily_report.controllers;

import com.es.daily_report.enums.ProjectState;
import com.es.daily_report.vo.ProductRemoveVO;
import com.es.daily_report.vo.ProductVO;
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
public class ProductControllerTests {
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
        ProductVO productVO = ProductVO.builder()
                .number("11223344")
                .inLine("Key线")
                .name("某个项目")
                .build();
        testUtils.createProduct(productVO);
    }

    @Test
    @Transactional
    public void query() throws Exception {
        ProductVO productVO = ProductVO.builder()
                .number("11223344")
                .name("某个项目")
                .inLine("Key线")
                .build();
        testUtils.createProduct(productVO);
        testUtils.queryProduct("11223344");
        testUtils.queryAllProduct();
    }

    @Test
    @Transactional
    public void update() throws Exception {
        ProductVO productVO = ProductVO.builder()
                .number("11223344")
                .name("某个项目")
                .inLine("Key线")
                .build();
        testUtils.createProduct(productVO);
        productVO.setInLine("卡线");
        productVO.setName("改了名字");
        testUtils.updateProduct(productVO);
    }

    @Test
    @Transactional
    public void remove() throws Exception {
        ProductVO productVO = ProductVO.builder()
                .number("11223344")
                .name("某个项目")
                .inLine("Key线")
                .build();
        testUtils.createProduct(productVO);
        ProductVO productVO1 = ProductVO.builder()
                .number("223344")
                .name("别的项目")
                .inLine("别的产线")
                .build();
        testUtils.createProduct(productVO1);

        String[] numbers = new String[]{"11223344", "223344"};
        ProductRemoveVO productRemoveVO = ProductRemoveVO.builder()
                .numbers(numbers)
                .build();
        testUtils.removeProduct(productRemoveVO);
    }
}
