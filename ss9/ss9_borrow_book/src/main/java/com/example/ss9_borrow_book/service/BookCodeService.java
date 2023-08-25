package com.example.ss9_borrow_book.service;

import com.example.ss9_borrow_book.model.BookCode;
import com.example.ss9_borrow_book.repository.IBookCodeRepository;
import com.example.ss9_borrow_book.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookCodeService implements IBookCodeService {
    @Autowired
    private IBookCodeRepository bookCodeRepository;

    @Override
    public void add(BookCode bookCode) {
        bookCodeRepository.save(bookCode);
    }

    @Override
    public BookCode findByCode(int code) {
        return bookCodeRepository.findBookCodeByCode(code);
    }

    @Override
    public void delete(int code) {
        bookCodeRepository.deleteBookByCode(code);
    }
}
