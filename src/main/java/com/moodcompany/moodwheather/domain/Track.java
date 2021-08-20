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
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Track  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long key;
    @OneToMany
    @Cascade(CascadeType.ALL)
	private List<Artist> artists;

	private String name;
	


}
