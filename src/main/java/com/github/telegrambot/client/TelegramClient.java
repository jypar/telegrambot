package com.github.telegrambot.client;

import org.springframework.web.client.RestTemplate;
import java.util.Map;

public class TelegramClient {

    static final String URL_USERS = "https://cat-fact.herokuapp.com/facts/random?=cat&amount=1";
    RestTemplate restTemplate = new RestTemplate();

    public String getText(){
        Map<String,String> result = restTemplate.getForObject(URL_USERS,Map.class);
        return  result.get("text");
    }

}
