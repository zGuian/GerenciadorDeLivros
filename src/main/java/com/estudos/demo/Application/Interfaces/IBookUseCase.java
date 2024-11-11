package com.estudos.demo.Application.Interfaces;

import com.estudos.demo.Domain.Book;
import com.estudos.demo.Presentation.DTOs.BookDto;
import com.estudos.demo.Presentation.DTOs.CreateBookDto;

import java.util.List;

public interface IBookUseCase {
    Book convertDtoInEntity(BookDto bookDto);

    Book convertDtoInEntity(CreateBookDto bookDto);

    BookDto convertEntityInDto(Book book);

    List<BookDto> convertListEntityInListDto(List<Book> books);

    List<Book> convertListDtosInListEntities(List<BookDto> booksDtos);
}
