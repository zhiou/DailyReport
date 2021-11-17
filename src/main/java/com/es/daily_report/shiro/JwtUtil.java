package com.es.daily_report.shiro;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * @author lwf
 * @date: 2021/3/9
 */
public class JwtUtil {

    //JWT-account
    public static final String ACCOUNT = "account";

    //JWT-currentTimeMillis
    private final static String CURRENT_TIME_MILLIS = "currentTimeMillis";
    //失效时间一天d
    public static final long REFRESH_TOKEN_EXPIRE_TIME = 24 * 60 * 60 * 1000L;

    private static final String SECRET_KEY = "storewebkey";

//    public static final String UID = "uid";
    public static  final String DEPART_ID = "depart_id";

    public static  final String DEPART = "depart";

    public static  final String USER_NAME = "username";
    /**
     * 校验token是否正确
     *
     * @param token
     * @return
     */
    public static boolean verify(String token) {
        String secret = getClaim(token, ACCOUNT).asString() + SECRET_KEY;
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTVerifier verifier = JWT.require(algorithm)
            .build();

        verifier.verify(token);

        return true;
    }

    /**
     * 获得Token中的信息无需secret解密也能获得
     *
     * @param jwtToken
     * @param claim
     * @return
     */
    public static Claim getClaim(String jwtToken, String claim) {
        try {
            String[] parts = jwtToken.split(" ");
            if (parts.length < 1) {
                return null;
            }
            String token = parts[parts.length - 1];
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim(claim);
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 生成签名
     *
     * @param account
     * @param currentTimeMillis
     * @return
     */
    public static String sign(String account, String departId, String depart, String username, String currentTimeMillis) {
        // 帐号加JWT私钥加密
        String secret = account + SECRET_KEY;
        // 此处过期时间，单位：毫秒
        Date date = new Date(System.currentTimeMillis() + REFRESH_TOKEN_EXPIRE_TIME);
        Algorithm algorithm = Algorithm.HMAC256(secret);

        return JWT.create()
            .withClaim(ACCOUNT, account)
            .withClaim(DEPART_ID, departId)
                .withClaim(DEPART, depart)
                .withClaim(USER_NAME, username)
            .withClaim(CURRENT_TIME_MILLIS, currentTimeMillis)
            .withExpiresAt(date)
            .sign(algorithm);
    }

//    public static void main(String[] args) {
//        String token = JwtUtil.sign("admin", 100000100L, String.valueOf(System.currentTimeMillis()));
//        System.out.println(token);
//        System.out.println(JwtUtil.verify(token));
//        System.out.println(JwtUtil.getClaim(token, ACCOUNT));
//    }

}
