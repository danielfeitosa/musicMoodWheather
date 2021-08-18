package com.moodcompany.moodwheather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moodcompany.moodwheather.domain.TrackWheather;
import com.moodcompany.moodwheather.mappers.TrackMapper;
import com.moodcompany.moodwheather.services.TrackWheatherService;

@RestController
@RequestMapping("api/track")
public class TrackRestController {
   @Autowired
	private TrackMapper mapper;
   @Autowired
	private TrackWheatherService service;


	public TrackRestController(TrackMapper mapper, TrackWheatherService service) {
		super();
		this.mapper = mapper;
		this.service = service;
	}

	@GetMapping("/{city}")
	public TrackWheather buscarListaPorCidade(@PathVariable("city") String city) {

		return service.getTrackByCityWheather(city);

	}

}
