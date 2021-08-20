package com.moodcompany.moodwheather.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moodcompany.moodwheather.client.openwheather.OpenWheatherMapClient;
import com.moodcompany.moodwheather.client.openwheather.Wheather;
import com.moodcompany.moodwheather.domain.Genre;
import com.moodcompany.moodwheather.domain.TrackWheather;
import com.moodcompany.moodwheather.repository.TrackWheatherRepository;

@Service
public class TrackWheatherServiceImpl implements TrackWheatherService {

	private OpenWheatherMapClient openWheatherMapClient;

	private RecommendTracksService recommendTracksService;

	
	private TrackWheatherRepository repository;
	@Autowired
	public TrackWheatherServiceImpl(
			OpenWheatherMapClient openWheatherMapClient,
			RecommendTracksService recommendTracksService,
			 TrackWheatherRepository repository
			) {
		super();
		this.openWheatherMapClient = openWheatherMapClient;
		this.recommendTracksService = recommendTracksService;
		this.repository = repository;
	}

	@Override
	@Transactional
	public TrackWheather getTrackByCityWheather(String city) {
		Wheather wheatherCity = openWheatherMapClient.getWheatherByCity(city);
		Genre genre = getGenre(wheatherCity.getTempetatura());
		
		return repository.save(TrackWheather.builder()
				.city(city)
				.temperature(wheatherCity.getTempetatura())
				.genre(genre)
				.tracks(recommendTracksService.recommendTracks(genre))
				.build());
	

	}

	private Genre getGenre(double temperature) {
		if (temperature > 30) {
			return Genre.PARTY;
		} else if (temperature >= 15 && temperature <= 30) {
			return Genre.POP;
		}

		return Genre.CLASSICAL;

	}

}
