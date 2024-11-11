package com.estudos.demo.Application.Services;

import com.estudos.demo.Application.Interfaces.IBookService;
import com.estudos.demo.Domain.Book;
import com.estudos.demo.Infrastructure.Repositories.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    private final IBookRepository repository;

    @Autowired
    public BookService(IBookRepository bookRepository) {
        this.repository = bookRepository;
    }

    @Override
    public List<Book> getBooksForPaged(int valuePage) {
        List<Book> booksPaged = repository.findAll();

        return null;
    }

    @Override
    public Book getBookForTitle(String title) {
        var listTitle = repository.findByTitleStartingWith(title);
        return listTitle.getFirst();
    }

    @Override
    public Book getBookForAuthor(String author) {
        var listAuthor = repository.findByAuthorStartingWith(author);
        return listAuthor.getFirst();
    }

    @Override
    public Book getBookForCategory(String category) {
        var listCategory = repository.findByCategoryStartingWith(category);
        return listCategory.getFirst();
    }

    @Override
    public void registerInDb(Book book) {
        repository.save(book);
    }
}
