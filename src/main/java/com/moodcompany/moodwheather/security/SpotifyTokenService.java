package com.moodcompany.moodwheather.security;

import org.springframework.stereotype.Component;

@Component
public class SpotifyTokenService {
	
	
	
	private SpotifyToken spotifyToken;

	public SpotifyToken getSpotifyToken() {
		return spotifyToken;
	}

	public void setSpotifyToken(SpotifyToken spotifyToken) {
		this.spotifyToken = spotifyToken;
	}
	
	
	

}
