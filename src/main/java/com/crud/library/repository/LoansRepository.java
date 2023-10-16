package com.crud.library.repository;

import com.crud.library.domain.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {
    @Override
    List<Loans> findAll();

    @Override
    Loans save(Loans loans);

    @Override
    Optional<Loans> findById(Long loanId);

    @Override
    void deleteById(Long loanId);
}
