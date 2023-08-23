package com.example.ss8_user.service;

import com.example.ss8_user.model.User;
import com.example.ss8_user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;


    public void add(User user) {
        userRepository.save(user);
    }
}
