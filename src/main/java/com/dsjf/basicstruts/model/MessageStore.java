package com.dsjf.basicstruts.model;

public class MessageStore {
    private String message;

    public MessageStore() {
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message + " (from toString)";
    }
}
