package com.victor.security.controllers;

import dtos.RequestBookDTO;
import models.BookEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity postBook(RequestBookDTO dto) {

        this.bookService.saveBook(dto);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<BookEntity>> getBooks() {

        var listOfBooks = this.bookService.getAllBooks();

        return ResponseEntity.ok(listOfBooks);
    }
}
