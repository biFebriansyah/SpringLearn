package com.learnspring.springlearn.service;

import com.learnspring.springlearn.dto.UserAccountDto;
import com.learnspring.springlearn.exception.AuthException;

public interface AuthService {
    UserAccountDto login(String username, String password) throws AuthException;
}
