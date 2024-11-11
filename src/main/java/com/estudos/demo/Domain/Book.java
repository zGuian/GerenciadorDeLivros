package com.estudos.demo.Domain;

import com.estudos.demo.Domain.Annotations.Validation.ValidationInput;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "livros")
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "titulo", nullable = false)
    @ValidationInput
    public final String title;

    @Column(name = "autor", nullable = false)
    @ValidationInput
    public final String author;

    @Column(name = "editora", nullable = false)
    @ValidationInput
    public final String publisher;

    @Column(name = "ano_publicacao", nullable = false)
    public final int yearOfPublication;

    @Column(name = "categoria", nullable = false)
    public final String category;

    public Book(Long id , String title, String author, String publisher, int yearOfPublication, String category) {
        this.category = category;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
        this.author = author;
        this.title = title;
        this.id = id;
    }

    public Book(String title, String author, String publisher, int yearOfPublication, String category) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.category = category;
    }
}
