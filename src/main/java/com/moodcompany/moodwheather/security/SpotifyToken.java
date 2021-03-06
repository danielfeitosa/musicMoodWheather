package com.moodcompany.moodwheather.security;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpotifyToken {

	private String access_token;

	private String token_type;

	private int expires_in;
	
	private String refresh_token;
	
	private String scope;
	

	@JsonProperty("access_token")
	public String getAccess_token() {
		return this.access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	@JsonProperty("token_type")
	public String getToken_type() {
		return this.token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	@JsonProperty("expires_in")
	public int getExpires_in() {
		return this.expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	@JsonProperty("refresh_token")
	public String getRefresh_token() {
		return this.refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}


	@JsonProperty("scope")
	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	
}