package com.practice.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.crud.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
