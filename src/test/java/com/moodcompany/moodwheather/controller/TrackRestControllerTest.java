package com.moodcompany.moodwheather.controller;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class TrackRestControllerTest {

	private static final Logger logger = LoggerFactory.getLogger(TrackRestControllerTest.class);
    @Autowired
	MockMvc mockMvc;

	@Test
	void test() throws Exception {
//		String baseUrl = "/api/track/Recife";
//		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(baseUrl))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.city").isNotEmpty()).andReturn();
//		logger.info(result.getRequest().getMethod() + " " + result.getRequest().getRequestURI() + " STATUS ("
//				+ result.getResponse().getStatus() + ")");
//		System.out.println(result.getResponse().getContentAsString());
	}

}
