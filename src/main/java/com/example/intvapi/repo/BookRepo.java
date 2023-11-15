package com.example.intvapi.repo;

import com.example.intvapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepo extends JpaRepository<Book, Long > {
    
}
