package com.crud.library.repository;

import com.crud.library.domain.Readers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReadersRepository extends CrudRepository<Readers, Long> {
    @Override
    List<Readers> findAll();

    @Override
    Readers save(Readers readers);

    @Override
    Optional<Readers> findById(Long readerId);

    @Override
    void deleteById(Long readerId);
}
