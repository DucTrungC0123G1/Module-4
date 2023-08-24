package com.example.ss9_borrow_book.controller;

import com.example.ss9_borrow_book.model.Book;
import com.example.ss9_borrow_book.model.BookCode;
import com.example.ss9_borrow_book.service.IBookCodeService;
import com.example.ss9_borrow_book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Random;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IBookCodeService bookCodeService;

    @GetMapping("/list")
    public String showList(Model model) {
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "list";
    }
    @GetMapping("/detail/{id}")
    public String showBorrow(@PathVariable int id, Model model){
        Book book = bookService.findByIdBook(id);
        model.addAttribute("book",book);
        return "/detail";
    }
    @GetMapping("/borrow/{id}")
    public String borrow(@PathVariable int id, Model model){
        Book book = bookService.findByIdBook(id);
        Random random = new Random();
        int numberRandom = random.nextInt(9000)+1000;
        if (book.getQuantity()>=1){
            book.setQuantity(book.getQuantity()-1);
            BookCode bookCode = new BookCode(numberRandom,book);
            bookCodeService.add(bookCode);
            model.addAttribute("numberRandom",numberRandom);
            return "result1";
        }else{
            return "result2";
        }
    }
}
