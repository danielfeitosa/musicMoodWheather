package com.moodcompany.moodwheather.client.spotify;

import java.util.Base64;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.moodcompany.moodwheather.domain.Genre;
import com.moodcompany.moodwheather.domain.Track;
import com.moodcompany.moodwheather.security.SpotifyToken;

@Component
public class SpotifyClient {

	
	@Value("${prop.spotify.cliente_id}")
	private String client_id;
	@Value("${prop.spotify.secret_id}")
	private String secret_id;
	

	private final RestTemplate restTemplate;

	private SpotifyToken spotifyToken;

	@Autowired
	public SpotifyClient() {
		super();
		this.restTemplate = new RestTemplate();
	}
	public void authorize() {

		String apiTokenURL = "https://accounts.spotify.com/api/token";
		String grantType = "client_credentials";
		String basicAuth = client_id + ":" + secret_id;
		HttpHeaders headers = new HttpHeaders();
		String encoding = Base64.getEncoder().encodeToString(basicAuth.getBytes());
		headers.setBasicAuth(encoding);
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		MultiValueMap<String, String> bodyParamMap = new LinkedMultiValueMap<>();
		bodyParamMap.add("grant_type", grantType);
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(bodyParamMap, headers);
		spotifyToken = restTemplate.postForEntity(apiTokenURL, entity, SpotifyToken.class).getBody();
		
		
	}



	public List<Track> getTracksForGender(Genre genre) {
		String url = "https://api.spotify.com/v1/recommendations";
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("limit", 10)
				.queryParam("market", "BR").queryParam("seed_genres", genre.name().toLowerCase());

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(
				spotifyToken.getAccess_token());
		HttpEntity<String> entity = new HttpEntity<>("", headers);
		System.out.println(restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class));
		Response tracks = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, Response.class)
				.getBody();

		return tracks.getTracks();
	}

}
