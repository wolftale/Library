package com.crud.library.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "LOANS")
public class Loans {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "Copy_ID", unique = true)
    private Long copyId;

    @Column(name = "Reader_ID")
    private Long readerId;

    @Column(name = "Loan_Date")
    private LocalDate loanDate;

    @Column(name = "Return_Date")
    private LocalDate returnDate;
}
