package com.crud.library.service;

import com.crud.library.domain.Titles;
import com.crud.library.exceptions.TitlesNotFoundException;
import com.crud.library.repository.TitlesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class TitlesService {

    @Autowired
    private TitlesRepository repository;

    public List<Titles> getAllTitles() {
        return repository.findAll();
    }

    public Titles getTitles(final Long id) throws TitlesNotFoundException {
        return repository.findById(id).orElseThrow(TitlesNotFoundException::new);
    }

    public Titles saveTitles(final Titles titles) {
        return repository.save(titles);
    }

    public void deleteTitles(final Long id) {
        repository.deleteById(id);
    }
}
