package com.moodcompany.moodwheather.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.moodcompany.moodwheather.client.openwheather.Main;
import com.moodcompany.moodwheather.client.openwheather.OpenWheatherMapClient;
import com.moodcompany.moodwheather.client.openwheather.Wheather;
import com.moodcompany.moodwheather.domain.Genre;
import com.moodcompany.moodwheather.domain.Track;
import com.moodcompany.moodwheather.domain.TrackWheather;
import com.moodcompany.moodwheather.repository.TrackWheatherRepository;

@ExtendWith(MockitoExtension.class)
class TrackWheatherServiceImplTest {
	
	
	@Mock
	TrackWheatherRepository repository;
	@Mock
	OpenWheatherMapClient openWheatherMapClient;
	@Mock
	RecommendTracksServiceImpl recommendTracksService;
	@InjectMocks
	TrackWheatherServiceImpl service;
	
   @BeforeEach
	void setUp() {
	   Wheather wheather = new Wheather();
	   wheather.setMain(Main.builder().temp(30.6D).build());
	   when(openWheatherMapClient.getWheatherByCity("Brasilia")).thenReturn(wheather);
	   when(recommendTracksService.recommendTracks(any())).thenReturn(new ArrayList<>());
	  when(repository.save(any())).thenReturn(any());
	   
		
	}
	@Test
	void getTrackByCityWheatherSucess() {
		TrackWheather result= service.getTrackByCityWheather("Brasilia");
		   
		   assertEquals(result.getCity(), "Brasilia");
		   assertEquals(result.getGenre(), Genre.PARTY);
		  verify(repository).save(any());
		
	}

}
