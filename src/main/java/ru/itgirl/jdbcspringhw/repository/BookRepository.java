package ru.itgirl.jdbcspringhw.repository;

import ru.itgirl.jdbcspringhw.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book findBookID (Long id);
}