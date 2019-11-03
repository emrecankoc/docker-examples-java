package me.emrecankoc.examples.helloworld.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.emrecankoc.examples.helloworld.model.Book;
import me.emrecankoc.examples.helloworld.repository.BookRepository;

/**
 * BookController
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public ResponseEntity<?> getBooks() {
        return ResponseEntity.ok(bookRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookRepository.findById(id));
    }

    @PostMapping("/")
    public ResponseEntity<?> createBook(@Valid @RequestBody Book book) {
        return ResponseEntity.ok(bookRepository.save(book));
    }
}