package com.example.ss3_bai1.service;

import com.example.ss3_bai1.model.Mail;

import java.util.List;

public interface IMailService {
    List<Mail> display();

    Mail getMailById(int id);

    void updateMail(int id, Mail mail);
}
