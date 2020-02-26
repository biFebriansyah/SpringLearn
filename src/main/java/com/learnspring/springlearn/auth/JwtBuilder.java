package com.learnspring.springlearn.auth;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.learnspring.springlearn.dto.UserAccountDto;
import java.time.LocalDateTime;

public class JwtBuilder {

    public static final String THE_KEY = "JAVA_SPRING";

    public static String createToken (UserAccountDto userAccount) {
        try {
            LocalDateTime dt = LocalDateTime.now();
            Algorithm algorithm = Algorithm.HMAC256(THE_KEY);
            String token = JWT.create()
                    .withClaim("email", userAccount.getEmail())
                    .withClaim("name", userAccount.getName())
                    .withIssuer("auth0")
                    .sign(algorithm);

            return token;
        } catch (JWTCreationException err) {
            return null;
        }
    }
}
