package com.estudos.demo.Presentation.DTOs;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
public class CreateBookDto {
    public String title;
    public String author;
    public String publisher;
    public int yearOfPublication;
    public String category;

    public CreateBookDto(String title, String author, String publisher, int yearOfPublication, String category) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.category = category;
    }
}
