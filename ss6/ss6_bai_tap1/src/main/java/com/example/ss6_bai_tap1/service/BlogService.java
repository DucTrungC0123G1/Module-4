package com.example.ss6_bai_tap1.service;

import com.example.ss6_bai_tap1.model.Blog;
import com.example.ss6_bai_tap1.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public List<Blog> display() {
        return blogRepository.findAll();
    }
}
