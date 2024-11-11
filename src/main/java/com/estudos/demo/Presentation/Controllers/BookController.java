package com.estudos.demo.Presentation.Controllers;

import com.estudos.demo.Application.Interfaces.IBookHandler;
import com.estudos.demo.Presentation.DTOs.BookDto;
import com.estudos.demo.Presentation.DTOs.CreateBookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "api/v1/Book")
public class BookController {
    private final IBookHandler bookHandler;

    @Autowired
    public BookController(IBookHandler bookHandler) {
        this.bookHandler = bookHandler;
    }

    @GetMapping(value = "/getBooks", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BookDto> getBooksPage() {
        return bookHandler.getAllBooks();
    }

    @GetMapping(value = "/getBooks/category/{category}", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public BookDto getBooksForCategory(@PathVariable(value = "category") String category) {
        return bookHandler.getBooksForCategory(category);
    }

    @GetMapping(value = "/getBooks/author/{author}")
    public BookDto getBooksForAuthor(@PathVariable(value = "author") String author) {
        return bookHandler.getBooksForAuthor(author);
    }

    @GetMapping(value = "/getBooks/title/{title}")
    public BookDto getBooksForTitle(@PathVariable(value = "title") String title) {
        return bookHandler.getBooksForTitle(title);
    }

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createBook(@RequestBody CreateBookDto bookDto) {
        try {
            bookHandler.createBook(bookDto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
