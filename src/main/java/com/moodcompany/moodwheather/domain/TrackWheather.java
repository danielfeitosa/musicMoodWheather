package com.moodcompany.moodwheather.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TrackWheather {
	
	private String city;
	private Double temperature;
	
	private List<Track> tracks;
	
	private Genre genre;

}
