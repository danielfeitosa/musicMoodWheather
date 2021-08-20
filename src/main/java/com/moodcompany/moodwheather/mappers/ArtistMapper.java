package com.moodcompany.moodwheather.mappers;

import org.mapstruct.Mapper;

import com.moodcompany.moodwheather.domain.Artist;
import com.moodcompany.moodwheather.dto.ArtistDto;

@Mapper
public interface ArtistMapper {

	ArtistDto entityToDto(Artist track);
	
	Artist dtoToEntity(ArtistDto dto);
}
