package com.learnspring.springlearn.service;

import com.learnspring.springlearn.dto.UserAccountDto;
import com.learnspring.springlearn.model.UserAccount;
import java.util.List;

public interface UserAccountService {

    List<UserAccount> get();
    UserAccount getById(long id);
    UserAccount update(long id, UserAccountDto dto);
    String delete(long id);
    UserAccount post(String email, String name, String password);
}
