package com.example.ss3_bai1.service;

import com.example.ss3_bai1.model.Mail;
import com.example.ss3_bai1.repository.IMailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailService implements IMailService {
    @Autowired
    private IMailRepository mailRepository;

    @Override
    public List<Mail> display() {
        return mailRepository.displayMail();
    }

    @Override
    public Mail getMailById(int id) {
        return mailRepository.getMailById(id);
    }

    @Override
    public void updateMail(int id, Mail mail) {
        mailRepository.updateMail(id, mail);
    }
}
