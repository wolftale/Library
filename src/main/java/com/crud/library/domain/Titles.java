package com.crud.library.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "TITLES")
public class Titles {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "TITLE_ID", unique = true)
    private Long titleId;

    @NotNull
    @Column(name = "TITLE")
    private String title;

    @NotNull
    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "RELEASE_YEAR")
    private int releaseYear;
}
