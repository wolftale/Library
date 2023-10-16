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
@Entity(name = "READERS")
public class Readers {

    @Id
    @GeneratedValue
    @Column(name = "READER_ID", unique = true)
    private Long readerId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ACCOUNT_CREATED_DATE")
    @NotNull
    private LocalDate accountCreatedDate;
}
