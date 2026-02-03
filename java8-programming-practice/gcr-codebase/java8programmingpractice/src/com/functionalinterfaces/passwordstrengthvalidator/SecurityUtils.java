package com.functionalinterfaces.passwordstrengthvalidator;

public interface SecurityUtils {
    static boolean isStrong(String password) {
        return password.length() >= 8;
    }
}
