package com.example.s1_bai2.controller;

import com.example.s1_bai2.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("/dictionary")
    public String showDictionary() {
        return "dictionary";
    }

    @PostMapping("vietnamese")
    public String convert(@RequestParam String english, Model model) {
        String vietnamese = dictionaryService.convert(english);
        model.addAttribute("vietnamese", vietnamese);
        return "dictionary";
    }
}
