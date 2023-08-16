package com.example.ss3_bai1.controller;

import com.example.ss3_bai1.model.Mail;
import com.example.ss3_bai1.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MailController {
    @Autowired
    private IMailService mailService;

    @GetMapping("/mail/list")
    public String display(Model model) {
        List<Mail> mailList = mailService.display();
        model.addAttribute("mailList", mailList);
        return "/list";
    }

    @GetMapping("/edit")
    public String showEdit(int id, Model model) {
        Mail mail = mailService.getMailById(id);
        model.addAttribute("mail", mail);
        model.addAttribute("id", id);
        return "/edit";
    }

    @ModelAttribute("language")
    public String[] getLanguage() {
        return new String[]{"English", "Vietnamese", "Spanish", "Brazil"};
    }

    @ModelAttribute("pageSize")
    public int[] getPageSize() {
        return new int[]{5, 10, 15, 20, 25};
    }

    @PostMapping("mail/edit")
    public String edit(@ModelAttribute Mail mail) {
        mailService.updateMail(mail.getId(), mail);
        return "redirect:/mail/list";
    }

}
