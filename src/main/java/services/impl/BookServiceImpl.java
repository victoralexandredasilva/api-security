package services.impl;

import dtos.RequestBookDTO;
import models.BookEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repositories.BookRepository;
import services.BookService;

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
    public void saveBook(RequestBookDTO dto) {
        var entity = new BookEntity();
        BeanUtils.copyProperties(dto, entity);
        this.bookRepository.save(entity);
    }
}
