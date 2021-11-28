package com.github.telegrambot.command;

import com.github.telegrambot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.github.telegrambot.command.CommandName.FACTS;

public class StartCommand implements Command{
    private final SendBotMessageService sendBotMessageService;

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    public final  String START_MESSAGE =String.format( "Hi, I will send you facts about cats if you enter command" +
            " %s \uD83D\ude0a " ,FACTS.getCommandName());

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
