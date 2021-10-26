package com.es.daily_report.controllers;

import com.es.daily_report.dto.ReportQuery;
import com.es.daily_report.vo.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Component
public class TestUtils {
    @Autowired
    private MockMvc mvc;

    private String token;

    private ObjectMapper objectMapper = new ObjectMapper();

    void login(String username, String password) throws Exception {
        String userAuth = "{\"account\":" +
                "\"" + username + "\"," +
                "\"password\":" +
                "\"" + password + "\"" +
                "}";
        MvcResult result = mvc.perform(
                post("/v1/daily_report/user/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userAuth)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        String body = result.getResponse().getContentAsString();
        token = JsonPath.read(body, "$.data.token");
    }

    void modify(String password, String newPassword) throws Exception {
        String userAuth = "{" +
                "\"password\":" +
                "\"" + password + "\"," +
                "\"new_password\":" +
                "\"" + newPassword + "\"" +
                "}";
        MvcResult result = mvc.perform(
                put("/v1/daily_report/user/password")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userAuth)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }


    void logout() throws Exception {
        this.mvc.perform(post("/v1/daily_report/user/logout")
                .header("Authorization", token))
                .andDo(print())
                .andExpect(status().isOk());
    }


    void report(ReportVO report) throws Exception {
        String json = objectMapper.writeValueAsString(report);
        MvcResult result = mvc.perform(post("/v1/daily_report/report")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void getReport() throws Exception {
        SimpleDateFormat formator = new SimpleDateFormat("yyyy-MM-dd");
        MvcResult result = mvc.perform(get("/v1/daily_report/report")
                        .header("Authorization", token)
                        .param("type", "0")
                        .param("condition", "ES0092")
                        .param("from", formator.format(new Date()))
                        .param("to", formator.format(new Date()))
                        .contentType(MediaType.APPLICATION_JSON))

                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void getReportsOfDepartment() throws Exception {
        int type = 1;
        String departId = "106";
        SimpleDateFormat formator = new SimpleDateFormat("yyyy-MM-dd");

        MvcResult result = mvc.perform(get("/v1/daily_report/report")
                        .header("Authorization", token)
                        .param("type", "1")
                        .param("condition", "106")
                        .param("from", formator.format(new Date()))
                        .param("to", formator.format(new Date()))
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void createProject(ProjectVO projectVO) throws Exception {
        String json = objectMapper.writeValueAsString(projectVO);
        MvcResult result = mvc.perform(post("/v1/daily_report/project")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void queryProject(String projectNumber) throws Exception {
        MvcResult result = mvc.perform(get("/v1/daily_report/project")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("number", projectNumber))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void queryAllProject() throws Exception {
        MvcResult result = mvc.perform(get("/v1/daily_report/project")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void updateProject(ProjectVO projectVO) throws Exception {
        String json = objectMapper.writeValueAsString(projectVO);
        MvcResult result = mvc.perform(put("/v1/daily_report/project")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void removeProject(ProjectRemoveVO projectRemoveVO) throws Exception {
        String json = objectMapper.writeValueAsString(projectRemoveVO);
        MvcResult result = mvc.perform(delete("/v1/daily_report/project")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void createProduct(ProductVO productVO) throws Exception {
        String json = objectMapper.writeValueAsString(productVO);
        MvcResult result = mvc.perform(post("/v1/daily_report/product")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void queryProduct(String productNumber) throws Exception {
        MvcResult result = mvc.perform(get("/v1/daily_report/product")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("number", productNumber))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void queryAllProduct() throws Exception {
        MvcResult result = mvc.perform(get("/v1/daily_report/product")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void updateProduct(ProductVO productVO) throws Exception {
        String json = objectMapper.writeValueAsString(productVO);
        MvcResult result = mvc.perform(put("/v1/daily_report/product")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    void removeProduct(ProductRemoveVO productRemoveVO) throws Exception {
        String json = objectMapper.writeValueAsString(productRemoveVO);
        MvcResult result = mvc.perform(delete("/v1/daily_report/product")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }
}
