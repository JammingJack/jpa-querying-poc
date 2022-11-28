package com.example.typedqueryinvestigation;

import com.example.typedqueryinvestigation.entity.Author;
import com.example.typedqueryinvestigation.entity.Book;
import com.example.typedqueryinvestigation.repository.AuthorRepository;
import com.example.typedqueryinvestigation.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TypedQueryInvestigationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TypedQueryInvestigationApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookRepository bookRepository, AuthorRepository authorRepository){
        return args -> {
            var authorOne = authorRepository.save(new Author(10,"joe", List.of()));
            var authorTwo = authorRepository.save(new Author(20,"jane", List.of()));


            bookRepository.save(new Book(1,"Design patterns",7600,authorOne));
            bookRepository.save(new Book(2,"TDD",1600,authorOne));
            bookRepository.save(new Book(3,"Bash Bible",1600,authorTwo));
        };
    }
}
