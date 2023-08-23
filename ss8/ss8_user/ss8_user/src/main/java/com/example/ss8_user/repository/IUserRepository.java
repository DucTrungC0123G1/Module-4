package com.example.ss8_user.repository;

import com.example.ss8_user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {

}
