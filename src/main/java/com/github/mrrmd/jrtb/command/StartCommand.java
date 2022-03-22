package com.github.mrrmd.jrtb.command;

import com.github.mrrmd.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command {

    /**
     * Start {@link Command}.
     */

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Привет. Я Javarush Telegram Bot. Я помогу тебе быть в курсе последних " +
            "статей тех авторов, котрые тебе интересны. Я еще маленький и только учусь.";

    // Здесь не добавляем сервис через получение из Application Context.
    // Потому что если это сделать так, то будет циклическая зависимость, которая
    // ломает работу приложения.
    public  StartCommand(SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }
    @Override
    public void execute(Update update){
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }

}
