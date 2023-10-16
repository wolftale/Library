package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoansDto {
    private Long copyId;
    private Long readerId;
    private LocalDate loanDate;
    private LocalDate returnDate;
}
