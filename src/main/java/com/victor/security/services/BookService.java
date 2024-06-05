package com.victor.security.services;

import com.victor.security.dtos.RequestBookDTO;
import com.victor.security.models.BookEntity;

import java.util.List;

public interface BookService {
    List<BookEntity> getAllBooks();
    void postBook(RequestBookDTO dto);
}
