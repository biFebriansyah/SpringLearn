package com.learnspring.springlearn.service;

import java.util.List;
import com.learnspring.springlearn.dto.UserAccountDto;
import com.learnspring.springlearn.model.UserAccount;

public interface UserAccountService {

    List<UserAccount> get();
    UserAccount getById(long id);
    UserAccount update(long id, UserAccountDto dto);
    UserAccount delete(long id);
    UserAccount post(String email, String name, String password);
}
