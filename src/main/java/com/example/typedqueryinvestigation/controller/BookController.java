package com.example.typedqueryinvestigation.controller;

import com.example.typedqueryinvestigation.dto.BooksEarningsByAuthor;
import com.example.typedqueryinvestigation.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/book")
public class BookController {

    final private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public List<BooksEarningsByAuthor> getBooks(){

        return bookService.getAllBookEarningByAuthor();
    }
}
