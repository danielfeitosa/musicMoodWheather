package com.moodcompany.moodwheather.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moodcompany.moodwheather.client.openwheather.OpenWheatherMapClient;
import com.moodcompany.moodwheather.client.openwheather.Wheather;
import com.moodcompany.moodwheather.domain.Genre;
import com.moodcompany.moodwheather.domain.TrackWheather;

@Service
public class TrackWheatherServiceImpl implements TrackWheatherService {

	private OpenWheatherMapClient openWheatherMapClient;

	private RecommendTracksService recommendTracksService;

	@Autowired
	public TrackWheatherServiceImpl(OpenWheatherMapClient openWheatherMapClient,
			RecommendTracksService recommendTracksService) {
		super();
		this.openWheatherMapClient = openWheatherMapClient;
		this.recommendTracksService = recommendTracksService;
	}

	@Override
	public TrackWheather getTrackByCityWheather(String city) {
		Wheather wheatherCity = openWheatherMapClient.getWheatherByCity(city);
		Genre genre = getGenre(wheatherCity.getTempetatura());
		return TrackWheather.builder()
				.city(city)
				.temperature(wheatherCity.getTempetatura())
				.genre(genre)
				.tracks(recommendTracksService.recommendTracks(genre))
				.build();

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
