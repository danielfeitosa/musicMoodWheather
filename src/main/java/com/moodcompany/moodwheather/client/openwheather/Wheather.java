package com.moodcompany.moodwheather.client.openwheather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wheather {

	private Main main;

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
	
	public double getTempetatura() {
		return main.getTemp();
	}

	private static class Main {

		private double temp;

		@JsonProperty("temp")
		public double getTemp() {
			return this.temp;
		}

		
		
		

	}

}
