package com.example.thuc_hanh_ss3_2.service;

import com.example.thuc_hanh_ss3_2.model.Login;
import com.example.thuc_hanh_ss3_2.model.User;
import com.example.thuc_hanh_ss3_2.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public User checkLogin(Login login) {
        User user = userRepository.checkLogin(login);
        return user;
    }
}
