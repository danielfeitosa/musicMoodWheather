package com.moodcompany.moodwheather.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrackDto {

	private String id;

	private List<ArtitstDto> artists;

	private String name;

}
