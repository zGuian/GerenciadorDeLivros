package com.estudos.demo.Presentation.DTOs;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
public class BookDto {

    public Long id;

    public String title;

    public String author;

    public String publisher;

    public int yearOfPublication;

    public String category;

    public BookDto(Long id, String title, String author, String publisher, int yearOfPublication, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.category = category;
    }

    public BookDto(String title, String author, String publisher, int yearOfPublication, String category) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.category = category;
    }
}
