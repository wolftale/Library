package com.crud.library.repository;

import com.crud.library.domain.BookCopies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookCopiesRepository extends CrudRepository<BookCopies, Long> {
    @Override
    List<BookCopies> findAll();

    @Override
    BookCopies save(BookCopies bookCopies);

    @Override
    Optional<BookCopies> findById(Long copyId);

    @Override
    void deleteById(Long copyId);
}
