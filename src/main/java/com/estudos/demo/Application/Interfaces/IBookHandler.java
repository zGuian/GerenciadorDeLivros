package com.estudos.demo.Application.Interfaces;

import com.estudos.demo.Presentation.DTOs.BookDto;
import com.estudos.demo.Presentation.DTOs.CreateBookDto;

import java.util.List;

public interface IBookHandler {
    List<BookDto> getAllBooks();
    void createBook(CreateBookDto bookDto) throws Exception;
    BookDto getBooksForCategory(String category);
    BookDto getBooksForAuthor(String author);
    BookDto getBooksForTitle(String title);
}
