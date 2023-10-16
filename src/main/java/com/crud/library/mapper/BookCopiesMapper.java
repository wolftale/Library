package com.crud.library.mapper;

import com.crud.library.domain.BookCopies;
import com.crud.library.domain.BookCopiesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCopiesMapper {

    public BookCopies mapToBookCopies(final BookCopiesDto bookCopiesDto) {
        return new BookCopies(
                bookCopiesDto.getCopyId(),
                bookCopiesDto.getTitleId(),
                bookCopiesDto.getStatus()
        );
    }

    public BookCopiesDto mapToBookCopiesDto(final BookCopies bookCopies) {
        return new BookCopiesDto(
                bookCopies.getCopyId(),
                bookCopies.getTitleId(),
                bookCopies.getStatus()
        );
    }

    public List<BookCopiesDto> mapToBookCopiesDtoList(final List<BookCopies> bookCopiesList) {
        return bookCopiesList.stream()
                .map(this::mapToBookCopiesDto)
                .toList();
    }
}
