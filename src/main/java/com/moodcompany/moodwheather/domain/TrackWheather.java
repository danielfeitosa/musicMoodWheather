package com.moodcompany.moodwheather.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@AllArgsConstructor
@Builder
public class TrackWheather extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String city;
	private Double temperature;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Track> tracks;

	public Genre getGenre() {
		if (temperature > 30) {
			return Genre.PARTY;
		} else if (temperature >= 15 && temperature <= 30) {
			return Genre.POP;
		}
		return Genre.CLASSICAL;
	}

}
