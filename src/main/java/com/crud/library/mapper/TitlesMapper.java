package com.crud.library.mapper;

import com.crud.library.domain.Titles;
import com.crud.library.domain.TitlesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitlesMapper {

    public Titles mapToTitles(final TitlesDto titlesDto) {
        return new Titles(
                titlesDto.getTitleId(),
                titlesDto.getTitle(),
                titlesDto.getAuthor(),
                titlesDto.getReleaseYear()
        );
    }

    public TitlesDto mapToTitlesDto(final Titles titles) {
        return new TitlesDto(
                titles.getTitleId(),
                titles.getTitle(),
                titles.getAuthor(),
                titles.getReleaseYear()
        );
    }

    public List<TitlesDto> mapToTitlesDtoList(final List<Titles> titlesList) {
        return titlesList.stream()
                .map(this::mapToTitlesDto)
                .toList();
    }
}
