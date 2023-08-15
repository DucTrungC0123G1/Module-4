package com.example.ss2_bai1.controller;

import com.example.ss2_bai1.model.Condiment;
import com.example.ss2_bai1.service.ICondimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CondimentController {
    @Autowired
    private ICondimentService condimentService;
    @GetMapping("/condiment")
    public String display(Model model){
        List<Condiment> condimentList = condimentService.display();
        model.addAttribute("condimentList",condimentList);
        return "/list";

    }
    @PostMapping
    public String displayCondiment(String checkBoxName, Model model){
        String condiment = "";
        List<Condiment> condimentList = condimentService.display();
        model.addAttribute("condimentList",condimentList);
        if (checkBoxName!=null){
            condiment += checkBoxName;
        }
        model.addAttribute("condiment",condiment);
        return "/list";
    }
}
