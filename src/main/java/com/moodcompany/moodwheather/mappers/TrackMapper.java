package com.moodcompany.moodwheather.mappers;

import org.mapstruct.Mapper;

import com.moodcompany.moodwheather.domain.Track;
import com.moodcompany.moodwheather.dto.TrackDto;
@Mapper
public interface TrackMapper {
	
	TrackDto trackToTrackDto(Track track);
	
	Track trackDtoToTrack(TrackDto dto);

}
