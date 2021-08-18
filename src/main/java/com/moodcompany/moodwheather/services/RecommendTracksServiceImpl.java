package com.moodcompany.moodwheather.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moodcompany.moodwheather.client.spotify.SpotifyClient;
import com.moodcompany.moodwheather.domain.Genre;
import com.moodcompany.moodwheather.domain.Track;
@Service
public class RecommendTracksServiceImpl implements RecommendTracksService {
	
	private SpotifyClient spotifyClient;
	
	
	
    @Autowired
	public RecommendTracksServiceImpl(SpotifyClient spotifyClient) {
		super();
		this.spotifyClient = spotifyClient;
	}




	@Override
	public List<Track> recommendTracks(Genre genre) {
		
		return spotifyClient.getTracksForGender(genre);
	}
	
	

}
