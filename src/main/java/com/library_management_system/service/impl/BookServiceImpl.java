package com.library_management_system.service.impl;

import com.library_management_system.domain.Book;
import com.library_management_system.dto.BookDetails;
import com.library_management_system.exception.BookNotFoundException;
import com.library_management_system.repository.BookRepository;

import com.library_management_system.service.BookService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BookServiceImpl  implements BookService {

    @Autowired
    private  BookRepository bookRepository;
    /**
     * Fetches all available books.
     * @return List of books
     */
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * Add a book
     */
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     *Updates a book
     */
    public Book updateBook(int id, BookDetails bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() ->
                new BookNotFoundException("Book not found with ID: " + id));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setIsbn(bookDetails.getIsbn());
        book.setPublishedDate(bookDetails.getPublishedDate());
        return bookRepository.save(book);
    }

    /**
     *Deletes a book
     */
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
