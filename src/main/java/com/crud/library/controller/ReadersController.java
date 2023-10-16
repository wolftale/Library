package com.crud.library.controller;

import com.crud.library.domain.Readers;
import com.crud.library.domain.ReadersDto;
import com.crud.library.exceptions.ReadersNotFoundException;
import com.crud.library.mapper.ReadersMapper;
import com.crud.library.service.ReadersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/readers")
public class ReadersController {

    private final ReadersService readersService;
    private final ReadersMapper readersMapper;

    @GetMapping
    public ResponseEntity<List<ReadersDto>> getReaders() {
        return ResponseEntity.ok(readersMapper.mapToReadersDtoList(readersService.getAllReaders()));
    }

    @GetMapping(value = "{readerId}")
    public ResponseEntity<ReadersDto> getReaders(@PathVariable Long readerId) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "{readerId}")
    public ResponseEntity<Void> deleteReaders(@PathVariable Long readerId) {
        readersService.deleteReaders(readerId);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<ReadersDto> updateReaders(@RequestBody ReadersDto readersDto) {
        Readers readers = readersMapper.mapToReaders(readersDto);
        Readers savedReaders = readersService.saveReaders(readers);
        return ResponseEntity.ok(readersMapper.mapToReadersDto(savedReaders));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createReaders(@RequestBody ReadersDto readersDto) {
        Readers readers = readersMapper.mapToReaders(readersDto);
        Readers savedReaders = readersService.saveReaders(readers);
        return ResponseEntity.ok().build();
    }
}