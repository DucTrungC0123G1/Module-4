package com.example.s1.controller;

import com.example.s1.service.IConvertMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertMoneyController {
    @Autowired
    private IConvertMoneyService convertMoneyService;
    @GetMapping("/convert")
    public String showFormConvert(){
        return "/convert";
    }
    @PostMapping("/result")
    public String change(@RequestParam double usd, @RequestParam double rate, Model model){
        double result = convertMoneyService.convertMoney(usd,rate);
        model.addAttribute("result",result);
        return "/result";
    }
}
