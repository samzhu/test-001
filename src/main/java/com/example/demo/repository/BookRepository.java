package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entity.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, String> {

   @RestResource(exported = false)
   List<Book> findByAuthor(String author);

   @RestResource(path = "findByAuthor", exported = true)
   Page<Book> findByAuthor(@Param("author") String author, Pageable pageable);

   @RestResource(exported = false)
   List<Book> findByAuthor(@Param("author") String author, Sort sort);

}

