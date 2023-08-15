package com.example.ss2_bai2.controller;

import com.example.ss2_bai2.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculator {
    @Autowired
    private ICaculatorService caculatorService;

    @GetMapping("caculator")
    public String showCaculator() {
        return "/caculator";
    }

    @PostMapping("caculator")
    public String result(@RequestParam double num1, @RequestParam double num2, @RequestParam String caculator, Model model) {
        double results = 0;
        String mess = "";
        switch (caculator) {
            case "add":
                results = caculatorService.add(num1, num2);
                break;
            case "sub":
                results = caculatorService.sub(num1, num2);
                break;
            case "multi":
                results = caculatorService.multi(num1, num2);
                break;
            case "div":
                if (num2 == 0) {
                    mess = "Không thể chia cho 0";
                }
                results = caculatorService.div(num1, num2);

                break;
        }
        model.addAttribute("caculator", caculator);
        model.addAttribute("results", results);
        model.addAttribute("mess", mess);
        model.addAttribute("num2", num2);
        return "/caculator";
    }

}
