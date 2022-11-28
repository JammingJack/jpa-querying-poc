package com.example.typedqueryinvestigation.repository;


import com.example.typedqueryinvestigation.dto.BooksEarningsByAuthor;
import com.example.typedqueryinvestigation.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("select new com.example.typedqueryinvestigation.dto.BooksEarningsByAuthor(a.name, sum(b.price)) from Author as a join Book as b where a.id = b.author.id group by a.name ")
    List<BooksEarningsByAuthor> getListAuthorsEarnings();
}
