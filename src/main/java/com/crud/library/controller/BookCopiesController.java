package com.crud.library.controller;

import com.crud.library.domain.BookCopies;
import com.crud.library.domain.BookCopiesDto;
import com.crud.library.mapper.BookCopiesMapper;
import com.crud.library.service.BookCopiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/bookCopies")
public class BookCopiesController {

    private final BookCopiesService bookCopiesService;
    private final BookCopiesMapper bookCopiesMapper;

    @GetMapping
    public ResponseEntity<List<BookCopiesDto>> getBookCopies() {
        return ResponseEntity.ok(bookCopiesMapper.mapToBookCopiesDtoList(bookCopiesService.getAllBookCopies()));
    }

    @GetMapping(value = "{bookCopyId}")
    public ResponseEntity<BookCopiesDto> getBookCopies(@PathVariable Long copyId) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "{bookCopyId}")
    public ResponseEntity<Void> deleteBookCopies(@PathVariable Long copyId) {
        bookCopiesService.deleteBookCopies(copyId);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "{bookCopyId}")
    public ResponseEntity<BookCopiesDto> updateBookCopies(@RequestBody BookCopiesDto bookCopiesDto) {
        BookCopies bookCopies = bookCopiesMapper.mapToBookCopies(bookCopiesDto);
        bookCopiesService.saveBookCopies(bookCopies);
        return ResponseEntity.ok().build();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createBookCopies(@RequestBody BookCopiesDto bookCopiesDto) {
        BookCopies bookCopies = bookCopiesMapper.mapToBookCopies(bookCopiesDto);
        bookCopiesService.saveBookCopies(bookCopies);
        return ResponseEntity.ok().build();
    }
}
