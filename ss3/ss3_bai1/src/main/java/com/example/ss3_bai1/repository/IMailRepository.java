package com.example.ss3_bai1.repository;

import com.example.ss3_bai1.model.Mail;

import java.util.List;

public interface IMailRepository {
    List<Mail> displayMail();

    Mail getMailById(int id);

    void updateMail(int id, Mail mail);
}
