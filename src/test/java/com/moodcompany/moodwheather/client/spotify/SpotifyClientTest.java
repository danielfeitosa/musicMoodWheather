package com.moodcompany.moodwheather.client.spotify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moodcompany.moodwheather.domain.Genre;

@SpringBootTest
class SpotifyClientTest {
	@Autowired
	SpotifyClient client;

	@Test
	void test() {
		client.getTracksForGender(Genre.PARTY);
	}

}
