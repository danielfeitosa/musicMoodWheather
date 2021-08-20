package com.moodcompany.moodwheather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.moodcompany.moodwheather.client.spotify.SpotifyClient;

@SpringBootApplication
public class MoodwheatherApplication  {
	@Autowired
	SpotifyClient spotifyClient;

	public static void main(String[] args) {
		SpringApplication.run(MoodwheatherApplication.class, args);
	}

	

}
