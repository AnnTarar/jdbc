package ru.itgirl.jdbcspringhw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.jdbcspringhw.model.Book;
import ru.itgirl.jdbcspringhw.repository.BookRepository;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }

    @GetMapping(value = "/book/{id}")
    public Book findBookID(@PathVariable("id") Long id) {
        return bookRepository.findBookID(id);
    }

}
