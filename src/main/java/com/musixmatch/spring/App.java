package com.musixmatch.spring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class App {

@Bean
public RestTemplate restTemplate() {
RestTemplate restTemplate = new RestTemplate();
MappingJackson2HttpMessageConverter jackson = new MappingJackson2HttpMessageConverter();       
jackson.setSupportedMediaTypes(Arrays.asList(MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON));
      
        List<HttpMessageConverter<?>> messageConverters = new ArrayList();
        messageConverters.add(jackson);
        restTemplate.setMessageConverters(messageConverters);
return restTemplate;
}

public static void main(String[] args) {
SpringApplication.run(App.class, args);
}

}
