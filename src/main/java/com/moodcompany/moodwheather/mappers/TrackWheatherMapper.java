package com.moodcompany.moodwheather.mappers;

import org.mapstruct.Mapper;

import com.moodcompany.moodwheather.domain.TrackWheather;
import com.moodcompany.moodwheather.dto.TrackWheatherDto;
@Mapper
public interface TrackWheatherMapper {

	 TrackWheatherDto entityToDto(TrackWheather track);
	
	TrackWheather dtoToEntity(TrackWheatherDto dto);

}
