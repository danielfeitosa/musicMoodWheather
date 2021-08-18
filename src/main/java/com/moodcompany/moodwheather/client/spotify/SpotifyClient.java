package com.moodcompany.moodwheather.client.spotify;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.moodcompany.moodwheather.domain.Genre;
import com.moodcompany.moodwheather.domain.Track;
@Component
public class SpotifyClient {

	public final String OPEN_WHEATHER_API_ID = "6801fe9e74c3fd9d5a5b0ea6b668d7af";

	
   
	private final RestTemplate restTemplate;

	@Autowired
	public SpotifyClient() {
		super();
		this.restTemplate = new RestTemplate();
	}
	
	
	public void authorize() {
		String authorizeUrl="https://accounts.spotify.com/authorize";
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(authorizeUrl) 
				.queryParam("client_id", "4fda7f4932bf4c068141a1e526502f7e")
				.queryParam("response_type", "code")
				.queryParam("scope", "user-read-private user-read-email")
				.queryParam("show_dialog", true)
		        .queryParam("redirect_uri", "http://127.0.0.1:8080/api/spotify/callback");
		        
		ResponseEntity<String> response = restTemplate.exchange(builder.toUriString(),HttpMethod.GET,null, String.class);
		System.out.println(response.toString());
		System.out.println(builder.toUriString());
	
	}
	
	public void authorization(String code ) {
		
		String apiTokenURL="https://accounts.spotify.com/api/token";
		
		
		
	}
	
	
	public List<Track> getTracksForGender(Genre genre) {
		String url="https://api.spotify.com/v1/recommendations";
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("limit", 10)
				.queryParam("market", "BR")
				.queryParam("seed_genres", genre.name().toLowerCase());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth("BQBH7isY4MQ1nwz2G7WjVD_KPAi14RNIeZOePT8wG2fJ_mHNULzZu-Z0Ka2tQY8A-urTY_SSKzBSuQ0M-NVlVA0GxhEKP97LRa5JcNKqWeiK32vR1iHxUTw-1OS6v7onO4oYSWuC0UitTKaJhz3XCjUhvFW4e7Ty9jaVy22_Vgm6xA");
		HttpEntity<String> entity = new HttpEntity<>("", headers);
		
		Response tracks= restTemplate.exchange(builder.toUriString(),
				HttpMethod.GET,
				entity, Response.class).getBody(); 
		
		System.out.println(restTemplate.exchange(builder.toUriString(),
				HttpMethod.GET,
				entity, String.class).getBody()); 
		
		System.out.println(tracks.getTracks());
		return tracks.getTracks();
	}
	
	
	
	

}
