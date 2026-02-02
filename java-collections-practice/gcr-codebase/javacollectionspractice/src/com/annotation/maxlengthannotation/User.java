package com.annotation.maxlengthannotation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {

        // validation during object creation
        validateUsername(username);

        this.username = username;
    }

    private void validateUsername(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");

            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength maxLength = field.getAnnotation(MaxLength.class);

                if (username.length() > maxLength.value()) {
                    throw new IllegalArgumentException(
                        "Username length should not exceed " + maxLength.value()
                    );
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
