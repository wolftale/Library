package com.crud.library.controller;

import com.crud.library.domain.LoansDto;
import com.crud.library.mapper.LoansMapper;
import com.crud.library.service.LoansService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/loans")
public class LoansController {

    private final LoansService loansService;
    private final LoansMapper loansMapper;

    @GetMapping
    public ResponseEntity<List<LoansDto>> getLoans() {
        return ResponseEntity.ok(loansMapper.mapToLoansDtoList(loansService.getAllLoans()));
    }

    @GetMapping(value = "{loanId}")
    public ResponseEntity<LoansDto> getLoans(@PathVariable Long loanId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Void> createLoans(@RequestBody LoansDto loansDto) {
        loansService.saveLoans(loansMapper.mapToLoans(loansDto));
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "{loanId}")
    public ResponseEntity<LoansDto> updateLoans(@RequestBody LoansDto loansDto) {
        loansService.saveLoans(loansMapper.mapToLoans(loansDto));
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/return")
    public ResponseEntity<LoansDto> returnLoans(@RequestBody LoansDto loansDto) {
        loansService.saveLoans(loansMapper.mapToLoans(loansDto));
        return ResponseEntity.ok().build();

    }
}