package com.example.createblogapplication.repository;

import com.example.createblogapplication.model.Blog;
import com.example.createblogapplication.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
//    Page<Blog> findBlogByNameContaining(Pageable pageable, String name);

    @Query(value = "select *from blog", nativeQuery = true)
    Page<Blog> findAll(Pageable pageable);

    @Query(value = "select *from blog where id =:id", nativeQuery = true)
    Blog findById(@Param("id") int id);


    @Transactional
    @Query(value = "delete from blog where id=:id", nativeQuery = true)
    void delete(@Param("id") Blog blog);

    @Query(value = "select *from blog where name like:name",nativeQuery = true)
    Page<Blog> findBlogByNameContaining (@Param("name")Pageable pageable,String name);

    @Transactional
    @Query(value = "insert into blog (author,content,date,name,category_id) values(:author,:content,:date,:name,:category)",nativeQuery = true)
    void save(@Param("author") String author, @Param("content") String content, @Param("date") Date date,
              @Param("name") String name, @Param("category") Category category);
}
