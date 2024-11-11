package com.estudos.demo.Infrastructure.Repositories;

import com.estudos.demo.Domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorStartingWith(String author);

    List<Book> findByCategoryStartingWith(String category);

    List<Book> findByTitleStartingWith(String title);
}
