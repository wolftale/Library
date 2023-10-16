package com.crud.library.mapper;

import com.crud.library.domain.Loans;
import com.crud.library.domain.LoansDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoansMapper {

    public Loans mapToLoans(final LoansDto loansDto) {
        return new Loans(
                loansDto.getCopyId(),
                loansDto.getReaderId(),
                loansDto.getLoanDate(),
                loansDto.getReturnDate()
        );
    }

    public LoansDto mapToLoansDto(final Loans loans) {
        return new LoansDto(
                loans.getCopyId(),
                loans.getReaderId(),
                loans.getLoanDate(),
                loans.getReturnDate()
        );
    }

    public List<LoansDto> mapToLoansDtoList(final List<Loans> allLoans) {
        return allLoans.stream()
                .map(this::mapToLoansDto)
                .toList();
    }
}
