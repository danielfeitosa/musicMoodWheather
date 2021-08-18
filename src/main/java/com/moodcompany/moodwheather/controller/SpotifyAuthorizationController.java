package com.moodcompany.moodwheather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moodcompany.moodwheather.client.spotify.SpotifyClient;

@RestController
@RequestMapping("/api/spotify")
public class SpotifyAuthorizationController {
	
	
	SpotifyClient spotifyClient;
	
	
	
	
	 @GetMapping("/callback")
	 public void  getResponseRedirectSpotify(
			 @RequestParam(required = false) String code,
			 @RequestParam(required = false) String state,
			 @RequestParam(required = false) String error
			
			
			 ) {
		 
		
		 System.out.println("getResponseRedirectSpotify");
		 
		 
	 }
	 
	 
	 
	 
	
	

}
