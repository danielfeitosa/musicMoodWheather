package com.moodcompany.moodwheather.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.moodcompany.moodwheather.repository.TrackWheatherRepository;

@ExtendWith(MockitoExtension.class)
class TrackWheatherServiceImplTest {
	
	
	@Mock
	TrackWheatherRepository repository;
	@InjectMocks
	TrackWheatherService service;
	

	@Test
	void test() {
		
	}

}
