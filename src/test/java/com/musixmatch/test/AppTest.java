package com.musixmatch.test;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class AppTest {
	@Test
	public void test() {
		String uri = "https://api.musixmatch.com/ws/1.1/track.lyrics.get?apikey=ea763ea7d9e5f955b69ed38ea84ba970&track_id=15953433";
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(uri, String.class);
		System.out.println(response);
	}

}
