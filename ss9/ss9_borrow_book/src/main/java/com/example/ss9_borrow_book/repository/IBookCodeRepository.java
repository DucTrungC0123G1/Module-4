package com.example.ss9_borrow_book.repository;

import com.example.ss9_borrow_book.model.BookCode;
import javafx.beans.property.adapter.JavaBeanProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

public interface IBookCodeRepository extends JpaRepository<BookCode,Integer> {


    @Query(value = "select * from book join book_code on book_code.book_id = book.id where book_code.code =:code",nativeQuery = true)
    BookCode findBookCodeByCode(@Param("code") int code);

    @Transactional
    void deleteBookByCode(int code);
}
