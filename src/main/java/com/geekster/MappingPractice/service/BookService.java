package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Book;
import com.geekster.MappingPractice.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBook(Integer id) {
        return bookRepo.getById(id);
    }

    public void updateBook(Book book) {
        bookRepo.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepo.deleteById(id);
    }
}
