package ru.javabegin.training.library.dao;

import ru.javabegin.training.library.domain.Book;

import java.util.List;

public interface BookDao {
    List<Book> getAll();
    Book get(long id);
    Book save(Book obj);
    void delete(Book object);

    List<Book> search(String... searchString);

    List<Book> findTopBooks(int limit);

}
