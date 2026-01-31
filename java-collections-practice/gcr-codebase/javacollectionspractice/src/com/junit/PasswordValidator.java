package com.junit;

public class PasswordValidator {
    public boolean isValid(String password) {
        if (password.length() < 8) return false;

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        return hasUpperCase && hasDigit;
    }
}
