package com.moodcompany.moodwheather.mappers;

import org.mapstruct.Mapper;

import com.moodcompany.moodwheather.domain.Track;
import com.moodcompany.moodwheather.dto.TrackDto;
@Mapper
public interface TrackMapper {
	
	TrackDto entityToDto(Track track);
	
	Track dtoToEntity(TrackDto dto);

}
