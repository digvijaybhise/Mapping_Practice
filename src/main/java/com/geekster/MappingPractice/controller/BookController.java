package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Book;
import com.geekster.MappingPractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping()
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping()
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("{id}")
    public Book getbook(@PathVariable Integer id){
        return bookService.getBook(id);
    }

    @PutMapping()
    public void updateBook(@RequestBody Book book){
        bookService.updateBook(book);
    }

    @DeleteMapping("{id}")
    public void deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
    }
}
