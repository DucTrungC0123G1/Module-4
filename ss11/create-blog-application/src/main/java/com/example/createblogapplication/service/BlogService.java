package com.example.createblogapplication.service;

import com.example.createblogapplication.model.Blog;
import com.example.createblogapplication.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository BlogRepository;

    @Override
    public List<Blog> findALl() {
        return BlogRepository.findAll();
    }
    public Page<Blog> findAll(Pageable pageable,String name){
        return BlogRepository.findBlogByNameContaining(pageable,name);
    }

    @Override
    public void add(Blog blog) {
        BlogRepository.save(blog);
    }

    @Override
    public void delete(Blog blog) {
        BlogRepository.delete(blog);
    }

    @Override
    public Blog findById(int id) {
        return BlogRepository.findById(id);
    }

    @Override
    public void edit(Blog blog) {
        BlogRepository.save(blog);
    }

    @Override
    public List<Blog> findByNameBlog(String name) {
        List<Blog> blogList = findALl();
        List<Blog> blogs = new ArrayList<>();
        for (Blog b: blogList) {
            if(b.getName().contains(name)){
                blogs.add(b);
            }
        }return blogs;
    }
}