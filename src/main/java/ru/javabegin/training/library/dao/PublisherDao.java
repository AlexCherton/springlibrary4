package ru.javabegin.training.library.dao;

import ru.javabegin.training.library.domain.Publisher;

import java.util.List;

public interface PublisherDao{
    List<Publisher> getAll();
    Publisher get(long id);
    Publisher save(Publisher obj);
    void delete(Publisher object);

    List<Publisher> search(String... searchString);

}

