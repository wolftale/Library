package com.crud.library.controller;

import com.crud.library.domain.Titles;
import com.crud.library.domain.TitlesDto;
import com.crud.library.exceptions.TitlesNotFoundException;
import com.crud.library.mapper.TitlesMapper;
import com.crud.library.service.TitlesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/titles")
public class TitlesController {

    private final TitlesService titlesService;
    private final TitlesMapper titlesMapper;

    @GetMapping
    public ResponseEntity<List<TitlesDto>> getTitles() {
        return ResponseEntity.ok(titlesMapper.mapToTitlesDtoList(titlesService.getAllTitles()));
    }

    @GetMapping(value = "{titleId}")
    public ResponseEntity<Titles> getTitlesById(Long titleId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TitlesDto> createTitles(@RequestBody TitlesDto titlesDto) {
        Titles titles = titlesMapper.mapToTitles(titlesDto);
        Titles savedTitles = titlesService.saveTitles(titles);
        return ResponseEntity.ok(titlesMapper.mapToTitlesDto(savedTitles));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TitlesDto> updateTitles(@RequestBody TitlesDto titlesDto) {
        Titles titles = titlesMapper.mapToTitles(titlesDto);
        Titles savedTitles = titlesService.saveTitles(titles);
        return ResponseEntity.ok(titlesMapper.mapToTitlesDto(savedTitles));
    }

    @DeleteMapping(value = "{titleId}")
    public ResponseEntity<Void> deleteTitles(@PathVariable Long titleId) {
        titlesService.deleteTitles(titleId);
        return ResponseEntity.ok().build();
    }
}
