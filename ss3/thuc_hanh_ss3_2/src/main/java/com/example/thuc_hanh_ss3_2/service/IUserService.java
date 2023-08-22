package com.example.thuc_hanh_ss3_2.service;

import com.example.thuc_hanh_ss3_2.model.Login;
import com.example.thuc_hanh_ss3_2.model.User;

public interface IUserService {
    User checkLogin(Login login);
}
