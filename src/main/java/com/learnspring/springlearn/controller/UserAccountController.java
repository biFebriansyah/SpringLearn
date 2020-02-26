package com.learnspring.springlearn.controller;

import com.learnspring.springlearn.auth.NeedLogin;
import com.learnspring.springlearn.dto.UserAccountDto;
import com.learnspring.springlearn.service.UserAccountService;
import com.learnspring.springlearn.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class UserAccountController {

    @Autowired
    UserAccountService userAccountService;

    @NeedLogin
    @GetMapping
    public List<UserAccount> get() {
        return userAccountService.get();
    }

    @GetMapping("/{id}")
    public UserAccount getById(@PathVariable("id") long id) {
        return userAccountService.getById(id);
    }

    @PostMapping
    public UserAccount post(UserAccountDto dto) {
        return userAccountService.post(dto.getEmail(), dto.getName(), dto.getPassword());
    }

    @PutMapping("/{id}")
    public UserAccount put(@PathVariable("id") long id, @RequestBody UserAccountDto dto) {
        return userAccountService.update(id, dto);
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable("id") long id) {
        return userAccountService.delete(id);
    }

}
