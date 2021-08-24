package com.moodcompany.moodwheather.client.openwheather;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Main {
	
	
	private double temp;

	@JsonProperty("temp")
	public double getTemp() {
		return this.temp;
	}
	
	
}
