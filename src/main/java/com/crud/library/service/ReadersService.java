package com.crud.library.service;

import com.crud.library.domain.Readers;
import com.crud.library.exceptions.ReadersNotFoundException;
import com.crud.library.repository.ReadersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@RequiredArgsConstructor
@Service
public class ReadersService {

    @Autowired
    private final ReadersRepository repository;

    public List<Readers> getAllReaders() {
        return repository.findAll();
    }

    public Readers getReaders(final Long id) throws ReadersNotFoundException {
        return repository.findById(id).orElseThrow(ReadersNotFoundException::new);
    }

    public Readers saveReaders(final Readers readers) {
        return repository.save(readers);
    }

    public void deleteReaders(final Long id) {
        repository.deleteById(id);
    }
}
