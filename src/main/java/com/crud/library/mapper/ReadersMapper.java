package com.crud.library.mapper;

import com.crud.library.domain.Readers;
import com.crud.library.domain.ReadersDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadersMapper {

    public Readers mapToReaders(final ReadersDto readersDto) {
        return new Readers(
                readersDto.getReaderId(),
                readersDto.getFirstName(),
                readersDto.getLastName(),
                readersDto.getAccountCreated()
        );
    }

    public ReadersDto mapToReadersDto(Readers readers) {
        return new ReadersDto(
                readers.getReaderId(),
                readers.getFirstName(),
                readers.getLastName(),
                readers.getAccountCreatedDate()
        );
    }

    public List<ReadersDto> mapToReadersDtoList(List<Readers> readersList) {
        return readersList.stream()
                .map(this::mapToReadersDto)
                .toList();
    }
}
