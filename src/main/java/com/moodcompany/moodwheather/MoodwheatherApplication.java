package com.moodcompany.moodwheather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.moodcompany.moodwheather.client.spotify.SpotifyClient;

@SpringBootApplication
public class MoodwheatherApplication implements CommandLineRunner {
	@Autowired
	SpotifyClient spotifyClient;

	public static void main(String[] args) {
		SpringApplication.run(MoodwheatherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		spotifyClient.authorize();
	}

	

}
