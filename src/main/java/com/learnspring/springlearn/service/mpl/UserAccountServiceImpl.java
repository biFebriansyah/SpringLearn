package com.learnspring.springlearn.service.mpl;

import com.learnspring.springlearn.dto.UserAccountDto;
import com.learnspring.springlearn.model.UserAccount;
import com.learnspring.springlearn.repository.UserAccountRepository;
import com.learnspring.springlearn.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    UserAccountRepository userAccountRepository;

    @Override
    public List<UserAccount> get() {
        return null;
    }

    @Override
    public UserAccount getById(long id) {
        return null;
    }

    @Override
    public UserAccount update(long id, UserAccountDto dto) {
        return null;
    }

    @Override
    public UserAccount delete(long id) {
        return null;
    }

    @Override
    public UserAccount post(String email, String name, String password) {
        UserAccount ua = new UserAccount();
        ua.setEmail(email);
        ua.setName(name);
        ua.setPassword(password); // we will encrypt the password later
        userAccountRepository.save(ua);

        return ua;
    }
}
