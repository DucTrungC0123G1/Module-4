package com.example.ss6_bai_tap1.controller;

import com.example.ss6_bai_tap1.model.Blog;
import com.example.ss6_bai_tap1.service.IBlogService;
import com.example.ss6_bai_tap1.service.ITypeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ITypeBlogService typeBlogService;

    @GetMapping("blog/list")
    public String display(Model model) {
        List<Blog> blogList = blogService.display();
        model.addAttribute("blogList", blogList);
        return "/list";
    }
}
