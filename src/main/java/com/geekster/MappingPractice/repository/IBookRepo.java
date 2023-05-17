package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book, Integer> {
}
