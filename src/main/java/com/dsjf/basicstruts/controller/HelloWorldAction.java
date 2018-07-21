package com.dsjf.basicstruts.controller;

import com.dsjf.basicstruts.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Optional;

public class HelloWorldAction extends ActionSupport {
    private static int helloCount = 0;
    private MessageStore messageStore;
    private String userName;

    @Override
    public String execute() {
        messageStore = new MessageStore();
        helloCount++;

        Optional.ofNullable(userName)
            .ifPresent(x -> messageStore.setMessage(messageStore.getMessage() + " " + x));

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public int getHelloCount() {
        return helloCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
