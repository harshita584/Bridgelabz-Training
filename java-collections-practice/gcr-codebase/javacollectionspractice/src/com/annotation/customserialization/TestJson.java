package com.annotation.customserialization;

public class TestJson {

    public static void main(String[] args) {

        User user = new User("Harshita", 21, "secret123");

        String json = JsonSerializer.toJson(user);

        System.out.println(json);
    }
}
