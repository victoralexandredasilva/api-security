package com.victor.security.controllers;

import com.victor.security.dtos.RequestBookDTO;
import com.victor.security.models.BookEntity;
import com.victor.security.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

        System.out.println("CAMADA DE CONTROLLER \n" + dto);

        if(dto.title() == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        this.bookService.postBook(dto);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<BookEntity>> getBooks() {

        var listOfBooks = this.bookService.getAllBooks();

        return ResponseEntity.ok(listOfBooks);
    }
}
