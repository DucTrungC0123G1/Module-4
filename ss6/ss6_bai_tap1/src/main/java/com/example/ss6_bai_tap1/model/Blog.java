package com.example.ss6_bai_tap1.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameBlog;
    private String blogDate;
    private String author;
    private String content;
    @ManyToOne
    @JoinColumn(name = "Type_Blog_Id",referencedColumnName = "id")
    private TypeBlog typeBlog;

    public Blog() {
    }

    public Blog(int id, String nameBlog, String blogDate, String author, String content) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.blogDate = blogDate;
        this.author = author;
        this.content = content;
    }

    public Blog(int id, String nameBlog, String blogDate, String author, String content, TypeBlog typeBlog) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.blogDate = blogDate;
        this.author = author;
        this.content = content;
        this.typeBlog = typeBlog;
    }

    public TypeBlog getTypeBlog() {
        return typeBlog;
    }

    public void setTypeBlog(TypeBlog typeBlog) {
        this.typeBlog = typeBlog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
