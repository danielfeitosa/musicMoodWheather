package com.moodcompany.moodwheather.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class TrackWheather {
	@Id
	private Long id;

	private String city;
	private Double temperature;
	@OneToMany
	private List<Track> tracks;

	private Genre genre;

}
