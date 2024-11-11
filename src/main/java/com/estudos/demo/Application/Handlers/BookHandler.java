package com.estudos.demo.Application.Handlers;

import com.estudos.demo.Application.Interfaces.IBookHandler;
import com.estudos.demo.Application.Interfaces.IBookService;
import com.estudos.demo.Application.Interfaces.IBookUseCase;
import com.estudos.demo.Domain.Book;
import com.estudos.demo.Presentation.DTOs.BookDto;
import com.estudos.demo.Presentation.DTOs.CreateBookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookHandler implements IBookHandler {
    private final IBookUseCase useCase;
    private final IBookService service;

    @Autowired
    public BookHandler(IBookService service, IBookUseCase useCase) {
        this.service = service;
        this.useCase = useCase;
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books = service.getBooksForPaged(1);
        return useCase.convertListEntityInListDto(books);
    }

    @Override
    public BookDto getBooksForCategory(String category) {
        var book = service.getBookForCategory(category);
        return useCase.convertEntityInDto(book);
    }

    @Override
    public BookDto getBooksForAuthor(String author) {
        var book = service.getBookForCategory(author);
        return useCase.convertEntityInDto(book);
    }

    @Override
    public BookDto getBooksForTitle(String title) {
        var book = service.getBookForCategory(title);
        return useCase.convertEntityInDto(book);
    }

    @Override
    public void createBook(CreateBookDto bookDto) throws Exception {
        var book = useCase.convertDtoInEntity(bookDto);
        service.registerInDb(book);
    }
}
