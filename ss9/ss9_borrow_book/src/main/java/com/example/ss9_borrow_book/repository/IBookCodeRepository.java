package com.example.ss9_borrow_book.repository;

import com.example.ss9_borrow_book.model.BookCode;
import javafx.beans.property.adapter.JavaBeanProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookCodeRepository extends JpaRepository<BookCode,Integer> {
}
