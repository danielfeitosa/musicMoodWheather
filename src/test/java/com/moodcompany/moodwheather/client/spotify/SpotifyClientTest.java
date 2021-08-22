package com.moodcompany.moodwheather.client.spotify;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moodcompany.moodwheather.domain.Genre;
import com.moodcompany.moodwheather.domain.Track;

@SpringBootTest
class SpotifyClientTest {
	@Autowired
	SpotifyClient client;

	@Test
	void test() {
		 List<Track> listaRresul=	client.getTracksForGender(Genre.PARTY);
		 
		 assertThat(listaRresul).isNotEmpty();
	}

}
