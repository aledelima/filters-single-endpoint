package br.com.aledelima.filter.repository;

import br.com.aledelima.filter.model.Book;

import java.util.List;
import java.util.Map;

public interface BookRepositoryCustom {

    List<Book> searchBooks(Map<String,String> allParams);

}
