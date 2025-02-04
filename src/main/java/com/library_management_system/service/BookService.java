package com.library_management_system.service;

import com.library_management_system.domain.Book;
import com.library_management_system.dto.BookDetails;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book addBook(Book book);

    Book updateBook(int id, BookDetails bookDetails);

    void deleteBook(int id);


}