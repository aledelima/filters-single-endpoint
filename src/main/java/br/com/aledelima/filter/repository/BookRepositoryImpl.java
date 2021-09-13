package br.com.aledelima.filter.repository;

import br.com.aledelima.filter.model.Book;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepositoryImpl implements BookRepositoryCustom {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Book> searchBooks(Map<String,String> allParams) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);

        Root<Book> book = cq.from(Book.class);
        List<Predicate> predicates = new ArrayList<>();

        allParams.forEach( (k, v) -> predicates.add(cb.equal(book.get(k), v)) );
        cq.where(predicates.toArray(new Predicate[0]));

        return em.createQuery(cq).getResultList();
    }

}
