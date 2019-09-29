package com.musixmatch.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping("lyricsearch")
public class MusicController {
	@Autowired
	private RestTemplate restTemplate; 
	@RestMapping(method = RequestMethod.GET)
	public String printMusic() {}

}
