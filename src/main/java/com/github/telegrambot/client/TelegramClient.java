package com.github.telegrambot.client;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;
public class TelegramClient {
    //static final String URL_USERS = "https://cat-fact.herokuapp.com/facts/random?=cat&amount=1";
    static final String URL_USERS = "https://api.adviceslip.com/advice";
    RestTemplate restTemplate = new RestTemplate();
    public String  getText(){
        JSONObject jsonObject = new JSONObject(restTemplate.getForObject(URL_USERS, String.class));
        return jsonObject.getJSONObject("slip").getString("advice");
    }
}
