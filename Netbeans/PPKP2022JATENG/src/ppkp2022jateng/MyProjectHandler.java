/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppkp2022jateng;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.TelegramApiException;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

/**
 *
 * @author Devan
 */
public class MyProjectHandler  extends TelegramLongPollingBot {

    
    public String msg = null;
    public String id = null;
    
    public MyProjectHandler() {
    }
    
    public void sendPesan (String id, String pesan) {
        SendMessage sendMessageRequest = new SendMessage();
        sendMessageRequest.setChatId(id);
        sendMessageRequest.setText(pesan);
        try {
            sendMessage(sendMessageRequest);
        } catch (TelegramApiException e) {
            
        }
    }

    @Override
    public String getBotToken() {   
        return BotConfig.TOKENMYPROJECT;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()) {
            Message message = update.getMessage();
            if(message.hasText()) {
                String pesanM = message.getChatId()+ " : " + message.getText();
                frmTelegram.lstPesan.add(pesanM);
                msg = message.getText();
                id = message.getChatId().toString();
                String name = message.getChat().getUserName();
                frmTelegram.getMsg(id, msg, name);
            }
        }
    }

    @Override
    public String getBotUsername() {
        return BotConfig.USERNAMEMYPROJECT;
    }   
}