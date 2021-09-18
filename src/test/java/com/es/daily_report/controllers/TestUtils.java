package com.es.daily_report.controllers;

import com.jayway.jsonpath.JsonPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Component
public class TestUtils {
    @Autowired
    private MockMvc mvc;

    private String token;

    void login(String username, String password) throws Exception {
        String userAuth = "{\"account\":" +
                "\"" + username + "\"," +
                "\"password\":" +
                "\"" + password + "\"" +
                "}";
        MvcResult result = mvc.perform(
                post("/daily_report/v1/user/login")
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
                post("/daily_report/v1/user/modify_password")
                        .header("Authorization", token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userAuth)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }
//
//    String getAccountInfo() throws Exception {
//        String body = "{\"account_id\":" +
//                "\"" + accountId + "\"" +
//                "}";
//        MvcResult result = mvc.perform(
//                post("/key_service/v1/account/query")
//                        .header("Authorization", token)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(body)
//        )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//        return result.getResponse().getContentAsString();
//    }
//
//    String getUsers(String account) throws Exception {
//        String body = "{\"page_index\":" +
//                "" + 1 + "," +
//                "\"page_size\":" +
//                "" + 10 + "," +
//                "\"query_type\":" +
//                "" + 0 + "," +
//                "\"query_content\":" +
//                "\"" + account + "\"" +
//                "}";
//        MvcResult result = mvc.perform(
//                post("/key_service/v1/users/query_list")
//                        .header("Authorization", token)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(body)
//        )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//        return result.getResponse().getContentAsString();
//    }
//
//    void banUser(String userId) throws Exception {
//        String userState = "{\"user_id\":" +
//                "\"" + userId + "\"," +
//                "\"state\":" +
//                + 0 +
//                "}";
//        mvc.perform(post("/key_service/v1/users/update_state")
//                .header("Authorization", token)
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(userState))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//    }
//
//    void removeUser(String userId) throws Exception {
//        String body = "{\"user_id\":" +
//                "\"" + userId + "\"" +
//                "}";
//        MvcResult result = mvc.perform(
//                post("/key_service/v1/users/delete")
//                        .header("Authorization", token)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(body)
//        )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//    }
//
//    String modifyProfile(String nickName, String headImgUrl) throws Exception {
//        String desc = "updated introduce or resume";
//        String profile = "{\"account_id\":" +
//                "\"" + accountId + "\"," +
//                "\"nick_name\":" +
//                "\"" + nickName + "\"," +
//                "\"head_img_url\":" +
//                "\"" + headImgUrl + "\"," +
//                "\"desc\":" +
//                "\"" + desc + "\"" +
//                "}";
//        MvcResult result = mvc.perform(
//                post("/key_service/v1/account/update_profile")
//                        .header("Authorization", token)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(profile)
//        )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//        return result.getResponse().getContentAsString();
//    }

    void logout() throws Exception {
        this.mvc.perform(post("/daily_report/v1/user/logout")
                .header("Authorization", token))
                .andDo(print())
                .andExpect(status().isOk());
    }

//    String createAccount(String username, String password) throws Exception {
//        String desc = "introduce or resume";
//        String accountInfo = "{\"account\":" +
//                "\"" + username + "\"," +
//                "\"password\":" +
//                "\"" + password + "\"," +
//                "\"desc\":" +
//                "\"" + desc + "\"" +
//                "}";
//        MvcResult result = mvc.perform(post("/key_service/v1/account/create")
//                .header("Authorization", token)
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(accountInfo))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//        String body = result.getResponse().getContentAsString();
//        return JsonPath.read(body, "$.data.account_id");
//    }
//
//    String createBannedAccount(String username, String password) throws Exception {
//        String desc = "introduce or resume";
//        String accountInfo = "{\"account\":" +
//                "\"" + username + "\"," +
//                "\"password\":" +
//                "\"" + password + "\"," +
//                "\"desc\":" +
//                "\"" + desc + "\"" +
//                "}";
//        MvcResult result = mvc.perform(post("/key_service/v1/account/create")
//                .header("Authorization", token)
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(accountInfo))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//        String body = result.getResponse().getContentAsString();
//        String userId = JsonPath.read(body, "$.data.user_id");
//        String accountId = JsonPath.read(body, "$.data.account_id");
//
//        banUser(userId);
//        return accountId;
//    }
//
//    void issue(String sn, byte[] pubKey, byte[] priKey) throws Exception {
//        SM2 sm2 = new SM2BC();
//        SM4 sm4 = new SM4ES();
//        ObjectMapper mapper = new ObjectMapper();
//        String strPuk = Base64.getEncoder().encodeToString(pubKey);
//        String strPriK = Base64.getEncoder().encodeToString(priKey);
//
//        byte[] brandom = genRandom(16);
//        String random = Base64.getEncoder().encodeToString(brandom);
//
//        CreateRequestVO createRequestVO = new CreateRequestVO();
//        createRequestVO.setSn(sn);
//        createRequestVO.setPubkey(strPuk);
//        createRequestVO.setRandom(random);
//        String content = "{\"sn\":" +
//                "\"" +sn + "\"," +"\"pubkey\":" + "\"" + strPuk + "\"," +
//                "\"random\":" + "\"" + random + "\"" +"}";
//        String contentPak = "{\"request_data\":" +"\"" + convertReq(content) + "\""  +"}";
//
//        MvcResult result = mvc.perform(
//                post("/key_service/v1/key_info/create" )
//                        .header("Authorization", token)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(contentPak)
//        )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//        String body = result.getResponse().getContentAsString();
//        String respData = JsonPath.read(body, "$.data.response_data");
//        CreateResponseVO createResponseVO = mapper.readValue(convertResp(respData), CreateResponseVO.class);
//        byte[] clientPubKey = Base64.getDecoder().decode(createResponseVO.getPubkey());
//        byte[] clientPriKeyCipher = Base64.getDecoder().decode(createResponseVO.getPrikey());
//        byte[] protectKeyCipher = Base64.getDecoder().decode(createResponseVO.getSymmCipher());
//        byte[] randomCipher = Base64.getDecoder().decode(createResponseVO.getRandomCipher());
//
//        // 解密交换密钥对
//        byte[] protectKey = sm2.decrypt(protectKeyCipher, priKey);
//        byte[] clientPriKey = sm4.decECB(protectKey, clientPriKeyCipher);
//
//        byte[] snRand1Rand2 = sm2.decrypt(randomCipher, clientPriKey);
//
//        byte[] bSN = sub(snRand1Rand2, 0, sn.length());
//        byte[] random1 = sub(snRand1Rand2, sn.length(), 16);
//        byte[] random2 = sub(snRand1Rand2, sn.length() + 16, 16);
//
//        Assert.assertEquals(sn.getBytes(), bSN);
//        Assert.assertEquals(brandom, random1);
//
//        byte[] snRand2 = concat(sn.getBytes(StandardCharsets.UTF_8), random2);
//        byte[] snRand2Encrypted = sm2.encrypt(snRand2, clientPubKey);
//        String random_cipher = Base64.getEncoder().encodeToString(snRand2Encrypted);
//
//        String contentConfirm = "{\"sn\":" +
//                "\"" +sn + "\"," +"\"random_cipher\":" + "\"" + random_cipher + "\"" + "}";
//        String contentConfirmPak = "{\"request_data\":" + "\"" + convertReq(contentConfirm) + "\"" + "}";
//        MvcResult result2 = mvc.perform(
//                post("/key_service/v1/key_info/confirm" )
//                        .header("Authorization", token)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(contentConfirmPak)
//        )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//    }
//
//    String getKeys(String sn) throws Exception{
//        String body = "{\"page_index\":" +
//                "" + 1 + "," +
//                "\"page_size\":" +
//                "" + 10 + "," +
//                "\"query_type\":" +
//                "" + 0 + "," +
//                "\"query_content\":" +
//                "\"" + sn + "\"" +
//                "}";
//        MvcResult result = mvc.perform(
//                post("/key_service/v1/key_info/query_list")
//                        .header("Authorization", token)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(body)
//        )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//        return result.getResponse().getContentAsString();
//    }
//
//    String getKeyHistory(String sn) throws Exception{
//        String body = "{\"sn\":" +
//                "\"" + sn + "\"," +
//                "\"page_index\":" +
//                "" + 1 + "," +
//                "\"page_size\":" +
//                "" + 10 + "" +
//                "}";
//        MvcResult result = mvc.perform(
//                post("/key_service/v1/key_info/history")
//                        .header("Authorization", token)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(body)
//        )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//        return result.getResponse().getContentAsString();
//    }
//
//    String convertReq(String req) {
//        String key = "1234567887654321";
//        SM4 sm4 = new SM4ES();
//        byte[] cipher = null;
//        try {
//            cipher = sm4.encCBC(key.getBytes(StandardCharsets.UTF_8), req.getBytes(StandardCharsets.UTF_8), Padding.PKCS5Padding);
//        } catch (SmCryptoException e) {
//            e.printStackTrace();
//        }
//        return Base64.getEncoder().encodeToString(cipher);
//    }
//
//    String convertResp(String resp) {
//        String key = "1234567887654321";
//        SM4 sm4 = new SM4ES();
//        byte[] plain = null;
//        try {
//            plain = sm4.decCBC(key.getBytes(StandardCharsets.UTF_8), Base64.getDecoder().decode(resp) ,Padding.PKCS5Padding);
//        } catch (SmCryptoException e) {
//            e.printStackTrace();
//        }
//        return plain == null? null:new String(plain);
//    }
}
