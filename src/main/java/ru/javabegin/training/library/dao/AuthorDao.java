package ru.javabegin.training.library.dao;

import ru.javabegin.training.library.domain.Author;
import ru.javabegin.training.library.domain.Genre;

import java.util.List;

public interface AuthorDao{
    List<Author> getAll();
    Author get(long id);
    Genre save(Author obj);
    void delete(Author object);

    List<Author> search(String... searchString);

}
