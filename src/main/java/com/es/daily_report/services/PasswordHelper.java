package com.es.daily_report.services;

import com.es.daily_report.entities.Auth;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author lwf
 * @date: 2021/3/9
 */
@Service
public class PasswordHelper {

    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    @Value("${password.algorithmName}")
    private String algorithmName = "md5";
    @Value("${password.hashIterations}")
    private int hashIterations = 2;

    public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public void setHashIterations(int hashIterations) {
        this.hashIterations = hashIterations;
    }

    public void encryptPassword(Auth auth) {
        auth.setSalt(randomNumberGenerator.nextBytes().toHex());
        ByteSource bytes = ByteSource.Util.bytes(auth.getSalt());
        SimpleHash simpleHash = new SimpleHash(
                algorithmName,
                auth.getCredential(),
                bytes,
                hashIterations);
        String newPassword = simpleHash.toHex();

        auth.setCredential(newPassword);
    }

    public boolean verifyPassword(Auth auth, String password) {
        String hash = new SimpleHash(
                algorithmName,
                password,
                ByteSource.Util.bytes(auth.getSalt()),
                hashIterations
        ).toHex();
        return auth.getCredential().equals(hash);
    }
}
