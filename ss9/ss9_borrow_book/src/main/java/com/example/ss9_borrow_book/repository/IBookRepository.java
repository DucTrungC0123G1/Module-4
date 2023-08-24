package com.example.ss9_borrow_book.repository;

import com.example.ss9_borrow_book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Integer> {
}
