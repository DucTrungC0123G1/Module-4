package com.example.thuc_hanh_ss3_2.repository;

import com.example.thuc_hanh_ss3_2.model.Login;
import com.example.thuc_hanh_ss3_2.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository{

    private static final List<User> users = new ArrayList<>();
    static {
        users.add(new User("abc","123","xyz","abc",18));
        users.add(new User("xyz","123","xyz","abccc",18));
        users.add(new User("qwe","123","xyz","abcccc",18));
    }


    @Override
    public User checkLogin(Login login) {
        for (User user: users){
            if (user.getAccount().equals(login.getAccount())
                && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
