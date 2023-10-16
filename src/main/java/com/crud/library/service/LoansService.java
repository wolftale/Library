package com.crud.library.service;

import com.crud.library.domain.Loans;
import com.crud.library.exceptions.LoansNotFoundException;
import com.crud.library.repository.LoansRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class LoansService {

    @Autowired
    private LoansRepository repository;

    public List<Loans> getAllLoans() {
        return repository.findAll();
    }

    public Loans getLoans(final Long id) throws LoansNotFoundException {
        return repository.findById(id).orElseThrow(LoansNotFoundException::new);
    }

    public Loans saveLoans(final Loans loans) {
        return repository.save(loans);
    }

    public void deleteLoans(final Long id) {
        repository.deleteById(id);
    }
}
