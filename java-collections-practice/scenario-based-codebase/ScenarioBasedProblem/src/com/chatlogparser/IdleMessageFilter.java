package com.chatlogparser;

import java.util.*;

public class IdleMessageFilter implements MessageFilter<String> {

    private Set<String> idleWords;

    public IdleMessageFilter() {
        idleWords = new HashSet<>();
        idleWords.add("lol");
        idleWords.add("brb");
        idleWords.add("haha");
    }

    public boolean allow(String message) {
        String msg = message.toLowerCase();
        for(String word : idleWords) {
            if(msg.contains(word)) {
                return false;
            }
        }
        return true;
    }
}
