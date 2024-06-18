package com.bookcase.bookservice.controller;

import com.bookcase.bookservice.dto.BookDto;
import com.bookcase.bookservice.dto.BookIdDto;
import com.bookcase.bookservice.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.script.ScriptTemplateConfig;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/v1/book")
public class BookController {

    Logger logger = LoggerFactory.getLogger(BookController.class);

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/isbn/{isbn}")
    public ResponseEntity<BookIdDto> getBookByIsbn(@PathVariable @NotNull String isbn) {
        logger.info("Book requested by isbn " + isbn);
        return ResponseEntity.ok(bookService.findByIsbn(isbn));
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable @NotNull String id){
        return ResponseEntity.ok(bookService.findBookDetailById(id));
    }
}
