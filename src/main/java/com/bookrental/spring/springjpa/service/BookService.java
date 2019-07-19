package com.bookrental.spring.springjpa.service;

import com.bookrental.spring.springjpa.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getAllbooks();

    Optional<Book> getBookById(int bookid);

    Book addBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(int bookid);

    List<Book> deleteAllBook();

    //void deleteBookID(int bookid);
}
