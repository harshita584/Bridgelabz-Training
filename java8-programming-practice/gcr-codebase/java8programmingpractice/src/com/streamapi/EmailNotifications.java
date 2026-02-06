package com.streamapi;

import java.util.List;

public class EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = List.of("a@mail.com", "b@mail.com", "c@mail.com");
        emails.forEach(email -> sendEmailNotification(email));
    }

    static void sendEmailNotification(String email) {
        System.out.println("Email sent to " + email);
    }
}
