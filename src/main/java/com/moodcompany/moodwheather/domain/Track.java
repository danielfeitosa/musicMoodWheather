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
public class Track  {
	
	private String id;

	private List<Artist> artists;

	private String name;
	


}
