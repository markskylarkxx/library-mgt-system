package com.library_management_system.repository;

import com.library_management_system.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Integer> {
}
