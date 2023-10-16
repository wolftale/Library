package com.crud.library.domain;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class ReadersDto {
    private Long readerId;
    private String firstName;
    private String lastName;
    private LocalDate accountCreated;
}
