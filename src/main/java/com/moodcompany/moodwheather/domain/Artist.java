package com.moodcompany.moodwheather.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Artist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  key;
	
	private String name;
	
	private String url;
	

}
