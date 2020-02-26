package com.learnspring.springlearn.controller;

import com.learnspring.springlearn.dto.UserAccountDto;
import com.learnspring.springlearn.exception.AuthException;
import com.learnspring.springlearn.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping
    public ResponseEntity login (UserAccountDto us) {
        try {
            return new ResponseEntity(authService.login(us.getEmail(), us.getPassword()), HttpStatus.OK);

        } catch (AuthException au) {
            return new ResponseEntity(au.getMessage(), HttpStatus.UNAUTHORIZED);

        }
    }
}
