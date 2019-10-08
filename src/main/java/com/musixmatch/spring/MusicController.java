package com.musixmatch.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

@Controller
@RequestMapping("lyricsearch")
public class MusicController {
@Autowired
private RestTemplate restTemplate;

@GetMapping
public String printMusic(ModelMap model, @RequestParam("songTitle") String songTitle,@RequestParam("artist") String artist) {
String uri = "https://api.musixmatch.com/ws/1.1/track.search?apikey=ea763ea7d9e5f955b69ed38ea84ba970&q_track="+songTitle+"&q_artist="+artist;
JsonNode response = restTemplate.getForObject(uri, JsonNode.class);
JsonNode tracklist = response.at("/message/body/track_list");
model.addAttribute("results", tracklist);
return "lyrics";

}
}