package com.moodcompany.moodwheather.client.openwheather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component

public class OpenWheatherMapClient {
	@Value("${prop.spotify.open_wheather_id}")
	private  String open_wheather_id;
	@Value("${prop.spotify.open_wheather_url}")
	private String apiHostWheather;
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
		        .queryParam("appid", open_wheather_id);
		        
		return restTemplate.getForObject( builder.toUriString(),Wheather.class);
	}
	
	

}
