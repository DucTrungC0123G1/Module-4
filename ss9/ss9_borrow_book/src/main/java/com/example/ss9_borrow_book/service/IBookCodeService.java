package com.example.ss9_borrow_book.service;

import com.example.ss9_borrow_book.model.BookCode;

public interface IBookCodeService {
    void add(BookCode bookCode);

    BookCode findByCode(int code);

    void delete(int code);
}
