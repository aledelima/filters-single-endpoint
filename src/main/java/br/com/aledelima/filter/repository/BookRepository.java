package br.com.aledelima.filter.repository;

import br.com.aledelima.filter.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long>, BookRepositoryCustom {
}
