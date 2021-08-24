package com.moodcompany.moodwheather.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moodcompany.moodwheather.client.openwheather.OpenWheatherMapClient;
import com.moodcompany.moodwheather.client.openwheather.Wheather;
import com.moodcompany.moodwheather.domain.TrackWheather;
import com.moodcompany.moodwheather.repository.TrackWheatherRepository;

@Service
public class TrackWheatherServiceImpl implements TrackWheatherService {

	private OpenWheatherMapClient openWheatherMapClient;

	private RecommendTracksService recommendTracksService;

	private TrackWheatherRepository repository;

	@Autowired
	public TrackWheatherServiceImpl(OpenWheatherMapClient openWheatherMapClient,
			RecommendTracksService recommendTracksService, TrackWheatherRepository repository) {
		super();
		this.openWheatherMapClient = openWheatherMapClient;
		this.recommendTracksService = recommendTracksService;
		this.repository = repository;
	}

	@Override
	@Transactional
	public TrackWheather getTrackByCityWheather(String city) {
		Wheather wheatherCity = openWheatherMapClient.getWheatherByCity(city);

		TrackWheather tackWheather = TrackWheather.builder()
				.city(city)
				.temperature(wheatherCity.getTempetatura())
				.build();

		tackWheather.setTracks(recommendTracksService.recommendTracks(tackWheather.getGenre()));
		repository.save(tackWheather);
		return tackWheather;

	}

}
