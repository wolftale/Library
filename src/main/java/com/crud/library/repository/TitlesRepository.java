package com.crud.library.repository;

import com.crud.library.domain.Titles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TitlesRepository extends CrudRepository<Titles, Long> {
    @Override
    List<Titles> findAll();

    @Override
    Titles save(Titles titles);

    @Override
    Optional<Titles> findById(Long titleId);

    @Override
    void deleteById(Long titleId);
}
