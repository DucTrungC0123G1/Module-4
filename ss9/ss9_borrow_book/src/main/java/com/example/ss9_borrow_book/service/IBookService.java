package com.example.ss9_borrow_book.service;

import com.example.ss9_borrow_book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book findByIdBook(int id);

    void addBook(Book book);
}
