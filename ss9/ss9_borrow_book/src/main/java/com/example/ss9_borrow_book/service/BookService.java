package com.example.ss9_borrow_book.service;

import com.example.ss9_borrow_book.model.Book;
import com.example.ss9_borrow_book.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{
    @Autowired
    private IBookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findByIdBook(int id) {
        return bookRepository.findById(id).orElse(null);
    }

}
