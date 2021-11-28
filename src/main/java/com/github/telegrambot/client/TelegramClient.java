package com.github.telegrambot.client;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.Map;


public class TelegramClient {

    static final String URL_USERS = "https://cat-fact.herokuapp.com/facts/random?=cat&amount=1";
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    public String getText(){

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map> response = restTemplate.exchange(URL_USERS,
                HttpMethod.GET, entity, Map.class);

        return (String) response.getBody().get("text");

    }

}
