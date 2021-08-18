package com.moodcompany.moodwheather.client.openwheather;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component

public class OpenWheatherMapClient {
	
	public final String OPEN_WHEATHER_API_ID ="6801fe9e74c3fd9d5a5b0ea6b668d7af";
	
	private String apiHostWheather="https://api.openweathermap.org/data/2.5/weather";
	
	private final RestTemplate restTemplate;
	
	public OpenWheatherMapClient(RestTemplateBuilder resteBuilder) {
		this.restTemplate = resteBuilder.build();
	}

	public void setApiHostWheather(String apiHostWheather) {
		this.apiHostWheather = apiHostWheather;
	}
	
	public Wheather getWheatherByCity(String city) {
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(apiHostWheather)
		        .queryParam("q", city)
		        .queryParam("units", "metric")
		        .queryParam("appid", OPEN_WHEATHER_API_ID);
		        
		return restTemplate.getForObject( builder.toUriString(),Wheather.class);
	}
	
	

}
