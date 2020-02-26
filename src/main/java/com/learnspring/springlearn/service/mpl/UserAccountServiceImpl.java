package com.learnspring.springlearn.service.mpl;

import com.learnspring.springlearn.dto.UserAccountDto;
import com.learnspring.springlearn.model.UserAccount;
import com.learnspring.springlearn.repository.UserAccountRepository;
import com.learnspring.springlearn.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    UserAccountRepository userAccountRepository;

    @Override
    public List<UserAccount> get() {
        List<UserAccount> result = new ArrayList<>();
        userAccountRepository.findAll().iterator().forEachRemaining(result::add);
        return result;
    }

    @Override
    public UserAccount getById(long id) {
        return userAccountRepository.findById(id).get();
    }

    @Override
    public UserAccount update(long id, UserAccountDto dto) {
        Optional<UserAccount> ua = userAccountRepository.findById(id);
        if (ua.get() != null) {
            UserAccount up = ua.get();
            up.setName(dto.getName());
            up.setEmail(dto.getEmail());
            up.setId(dto.getId());
            userAccountRepository.save(up);
            return up;
        }
        else {
            return null;
        }
    }

    @Override
    public String delete(long id) {
        userAccountRepository.deleteById(id);
        return "Seccses";
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
