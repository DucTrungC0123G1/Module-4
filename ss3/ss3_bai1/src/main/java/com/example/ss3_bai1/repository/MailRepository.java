package com.example.ss3_bai1.repository;

import com.example.ss3_bai1.model.Mail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository implements IMailRepository {
    private static List<Mail> mailList = new ArrayList<>();

    static {
    mailList.add(new Mail(0,"English",5,true,"Queen"));
    mailList.add(new Mail(1,"Spanish",15,false,"Xavie"));
    mailList.add(new Mail(2,"VietNam",25,true,"Abc"));
    mailList.add(new Mail(3,"Brazil",35,false,"Ronaldo"));
    }

    @Override
    public List<Mail> displayMail() {
        return mailList;
    }

    @Override
    public Mail getMailById(int id) {
        return mailList.get(id);
    }

    @Override
    public void updateMail(int id, Mail mail) {
        for (int i = 0; i < mailList.size(); i++) {
            if (id==mailList.get(i).getId()){
                mailList.set(i,mail);
            }
            
        }
    }
}
