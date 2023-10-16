package com.crud.library.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "BOOK_COPIES")
public class BookCopies {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "BOOK_COPY_ID", unique = true)
    private Long copyId;

    @Column(name = "TITLE_ID")
    private Long titleId;

    @Column(name = "STATUS")
    private String status;
}
