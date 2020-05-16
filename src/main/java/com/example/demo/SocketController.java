package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.text.SimpleDateFormat;
import java.util.Date;


//@Controller
class SocketController extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("Got message");
        String time = new SimpleDateFormat("HH:mm").format(new Date());
    }

    /*@MessageMapping("/chat")
    @SendTo("/chat")
    public String send(Message message) throws Exception {
        System.out.println("Got message");
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return message.getFrom() + " " + message.getContent() + " " +  time;
    }*/
}