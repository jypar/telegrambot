package com.github.telegrambot.command;

import com.github.telegrambot.client.TelegramClient;
import com.github.telegrambot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class FactsCommand implements Command{

    private final SendBotMessageService sendBotMessageService;
    TelegramClient telegramClient = new TelegramClient();
    public final  String START_MESSAGE = telegramClient.getText();

    public FactsCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
