package br.com.aledelima.filter.service;

import br.com.aledelima.filter.model.Book;
import br.com.aledelima.filter.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> searchBooks(Map<String, String> allParams) {
        return bookRepository.searchBooks(allParams);
    }

}
