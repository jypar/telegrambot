package com.github.telegrambot.service;

public interface SendBotMessageService {

    void sendMessage(String chatId, String message);
}
