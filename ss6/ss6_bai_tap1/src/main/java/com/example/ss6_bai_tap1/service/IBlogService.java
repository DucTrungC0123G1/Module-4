package com.example.ss6_bai_tap1.service;

import com.example.ss6_bai_tap1.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> display();

    Blog blog(int id);
}
