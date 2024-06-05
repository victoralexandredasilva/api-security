package com.victor.security.services.impl;

import com.victor.security.dtos.RequestBookDTO;
import com.victor.security.models.BookEntity;
import com.victor.security.repositories.BookRepository;
import com.victor.security.services.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookEntity> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public void postBook(RequestBookDTO dto) {
        var entity = new BookEntity();
        BeanUtils.copyProperties(dto, entity);
        this.bookRepository.save(entity);
    }
}
