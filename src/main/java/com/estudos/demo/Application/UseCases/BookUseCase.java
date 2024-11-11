package com.estudos.demo.Application.UseCases;

import com.estudos.demo.Application.Interfaces.IBookUseCase;
import com.estudos.demo.Domain.Book;
import com.estudos.demo.Presentation.DTOs.BookDto;
import com.estudos.demo.Presentation.DTOs.CreateBookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookUseCase implements IBookUseCase {
    @Override
    public Book convertDtoInEntity(BookDto bookDto) {
        return new Book(bookDto.title, bookDto.author, bookDto.publisher, bookDto.yearOfPublication, bookDto.category);
    }

    @Override
    public Book convertDtoInEntity(CreateBookDto bookDto) {
        return new Book(bookDto.title, bookDto.author, bookDto.publisher, bookDto.yearOfPublication, bookDto.category);
    }

    @Override
    public BookDto convertEntityInDto(Book book) {
        return new BookDto(book.id, book.title, book.author, book.publisher, book.yearOfPublication, book.category);
    }

    @Override
    public List<BookDto> convertListEntityInListDto(List<Book> books) {
        List<BookDto> bookDtoList = new ArrayList<>();
        for (Book item : books) {
            BookDto dto = new BookDto(item.id, item.title, item.author, item.publisher, item.yearOfPublication,
                    item.category);
            bookDtoList.add(dto);
        }
        return bookDtoList;
    }

    @Override
    public List<Book> convertListDtosInListEntities(List<BookDto> booksDtos) {
        List<Book> bookList = new ArrayList<>();
        for(BookDto item : booksDtos) {
            Book book = new Book(item.id, item.title, item.author, item.publisher, item.yearOfPublication,
                    item.category);
            bookList.add(book);
        }
        return bookList;
    }
}
