package com.example.ss9_borrow_book.repository;

import com.example.ss9_borrow_book.model.BookCode;
import javafx.beans.property.adapter.JavaBeanProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

public interface IBookCodeRepository extends JpaRepository<BookCode,Integer> {

    @Transactional
    @Modifying
    BookCode findBookCodeByCode(int code);
    void deleteBookByCode(int code);
}
