package com.example.ss6_bai_tap1.repository;

import com.example.ss6_bai_tap1.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {

}
