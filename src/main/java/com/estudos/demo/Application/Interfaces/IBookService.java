package com.estudos.demo.Application.Interfaces;

import com.estudos.demo.Domain.Book;

import java.util.List;

public interface IBookService {
    Book getBookForTitle(String title);
    Book getBookForAuthor(String author);
    Book getBookForCategory(String category);
    void registerInDb(Book book);
    List<Book> getBooksForPaged(int valuePage);
}
