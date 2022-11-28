package com.example.typedqueryinvestigation.service;

import com.example.typedqueryinvestigation.dto.BooksEarningsByAuthor;
import com.example.typedqueryinvestigation.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    final private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BooksEarningsByAuthor> getAllBookEarningByAuthor(){
        return bookRepository.getListAuthorsEarnings();
    }

}
