package com.moodcompany.moodwheather.client.openwheather;

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

	

}
