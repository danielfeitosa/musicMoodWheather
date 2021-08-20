package com.moodcompany.moodwheather.dto;

import java.util.List;

import com.moodcompany.moodwheather.domain.Genre;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TrackWheatherDto {
	
	

	private Long id;

	private String city;
	private Double temperature;

	private List<TrackDto> tracks;

	private Genre genre;

}
