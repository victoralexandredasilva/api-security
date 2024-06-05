package services;

import dtos.RequestBookDTO;
import models.BookEntity;

import java.util.List;

public interface BookService {

    List<BookEntity> getAllBooks();

    void saveBook(RequestBookDTO dto);
}
