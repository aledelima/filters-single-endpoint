package br.com.aledelima.filter.controller;

import br.com.aledelima.filter.model.Book;
import br.com.aledelima.filter.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> findBy(@RequestParam Map<String,String> allParams) {
        System.out.println("Find by...");
        allParams.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println();
        return ResponseEntity.ok(bookService.searchBooks(allParams));
    }

}
