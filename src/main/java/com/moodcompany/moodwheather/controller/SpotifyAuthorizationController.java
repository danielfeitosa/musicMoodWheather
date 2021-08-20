package com.moodcompany.moodwheather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moodcompany.moodwheather.client.spotify.SpotifyClient;

@RestController
@RequestMapping("api/callback")
public class SpotifyAuthorizationController {

	@Autowired
	SpotifyClient spotifyClient;

	// 774b29d4f13844c495f206cafdad9c86

	@GetMapping("/authorize")
	public void getResponseRedirectSpotify(@RequestParam(required = false) String code,
			@RequestParam(required = false) String state, @RequestParam(required = false) String error

	) {
      if(code != null) {
    	  spotifyClient.authorization(code);
      }else {
    	  
      }
		

	}

	

}
