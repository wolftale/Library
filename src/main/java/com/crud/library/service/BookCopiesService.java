package com.crud.library.service;

import com.crud.library.domain.BookCopies;
import com.crud.library.exceptions.BookCopiesNotFoundException;
import com.crud.library.exceptions.LoansNotFoundException;
import com.crud.library.repository.BookCopiesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class BookCopiesService {

    @Autowired
    private BookCopiesRepository repository;

    public List<BookCopies> getAllBookCopies() {
        return repository.findAll();
    }

    public BookCopies getBookCopies(final Long id) throws BookCopiesNotFoundException {
        return repository.findById(id).orElseThrow(BookCopiesNotFoundException::new);
    }

    public BookCopies saveBookCopies(final BookCopies bookCopies) {
        return repository.save(bookCopies);
    }

    public void deleteBookCopies(final Long id) {
        repository.deleteById(id);
    }
}
