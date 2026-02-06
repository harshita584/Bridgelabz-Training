package com.streamapi;

import java.util.List;

public class WelcomeMessage {
    public static void main(String[] args) {
        List<String> attendees = List.of("Name1", "Name2", "Name3");

        attendees.forEach(a -> System.out.println("Welcome " + a));
    }
}
