package com.example.demo;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

//@ServerEndpoint(value = "/chat")
public class ChatEndpoint {

    @OnOpen
    public void onOpen(Session session) throws IOException {
        System.out.println("OnOpen");
    }

    @OnMessage
    public void onMessage(Session session, String message) throws IOException {
        System.out.println("OnMessage");
    }

    @OnClose
    public void onClose(Session session) throws IOException {
        System.out.println("OnClose");
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        System.out.println("OnError");
    }
}