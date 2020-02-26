package com.learnspring.springlearn.auth;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.learnspring.springlearn.dto.UserAccountDto;

public class JwtCheck {

    public static UserAccountDto verifyToken(String token) {
        Algorithm algorithm = Algorithm.HMAC256(JwtBuilder.THE_KEY);
        JWTVerifier verifier = JWT.require(algorithm)
                .acceptLeeway(1)
                .withIssuer("auth0")
                .build(); //Reusable verifier instance
        DecodedJWT jwt = verifier.verify(token);
        UserAccountDto loggedUserVo = new UserAccountDto();
        return loggedUserVo;
    }
}
