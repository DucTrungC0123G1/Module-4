package com.example.ss9_borrow_book.model;

import javax.persistence.*;
import java.util.Map;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private int quantity;
    @OneToMany(mappedBy = "book")
    private Set<BookCode> bookCodeSet;


    public Book() {
    }

    public Book(int id, String name, String description, int quantity,Set<BookCode> bookCodeSet) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.bookCodeSet = bookCodeSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Set<BookCode> getBookCodeSet() {
        return bookCodeSet;
    }

    public void setBookCodeSet(Set<BookCode> bookCodeSet) {
        this.bookCodeSet = bookCodeSet;
    }
}
