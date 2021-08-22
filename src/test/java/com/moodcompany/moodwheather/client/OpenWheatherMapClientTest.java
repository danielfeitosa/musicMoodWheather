package com.moodcompany.moodwheather.client;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moodcompany.moodwheather.client.openwheather.OpenWheatherMapClient;
import com.moodcompany.moodwheather.client.openwheather.Wheather;
@SpringBootTest
class OpenWheatherMapClientTest {
	
	@Autowired
	OpenWheatherMapClient client;
	@Test
	void getWheatherByCity() {
		
		Wheather wheather = client.getWheatherByCity("Recife");
		assertThat(wheather).isNotNull();
		assertThat(wheather.getTempetatura()).isNotNull();
		
	}

}
