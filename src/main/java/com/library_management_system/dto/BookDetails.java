package com.library_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder

@NoArgsConstructor
public class BookDetails {


    private String title;
    private String author;
    private String isbn;
    private String publishedDate;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublishedDate() {
        return publishedDate;
    }


}
