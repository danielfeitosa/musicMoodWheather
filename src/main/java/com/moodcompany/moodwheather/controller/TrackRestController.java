package com.moodcompany.moodwheather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moodcompany.moodwheather.dto.TrackWheatherDto;
import com.moodcompany.moodwheather.mappers.TrackWheatherMapper;
import com.moodcompany.moodwheather.services.TrackWheatherService;
@CrossOrigin
@RestController
@RequestMapping("api/track")
public class TrackRestController {
   @Autowired
	private TrackWheatherMapper mapper;
   @Autowired
	private TrackWheatherService service;


	public TrackRestController(TrackWheatherMapper mapper, TrackWheatherService service) {
		super();
		this.mapper = mapper;
		this.service = service;
	}

	@GetMapping("/{city}")
	public TrackWheatherDto listTracksByCity(@PathVariable("city") String city) {

		return mapper.entityToDto(service.getTrackByCityWheather(city)) ;

	}

}
