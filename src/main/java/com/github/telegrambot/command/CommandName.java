package com.github.telegrambot.command;

public enum CommandName {

    START("/start"),
    STOP("/stop"),
    HELP("/help"),
    NO(""),
    FACTS("/facts");


    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
