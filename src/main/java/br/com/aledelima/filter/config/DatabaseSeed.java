package br.com.aledelima.filter.config;

import br.com.aledelima.filter.model.Book;
import br.com.aledelima.filter.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DatabaseSeed {

    @Autowired
    BookRepository repository;

    @Bean
    public void initializeDB() {

        Book book1 = new Book(null, "Earth", "Zeus");
        Book book2 = new Book(null, "Fire", "Hefasto");
        Book book3 = new Book(null, "Water", "Ponseidon");
        Book book4 = new Book(null, "Air", "Éolo");
        Book book5 = new Book(null, "Olimpo", "Zeus");

        repository.saveAll(Arrays.asList(book1, book2, book3, book4, book5));

    }


}
