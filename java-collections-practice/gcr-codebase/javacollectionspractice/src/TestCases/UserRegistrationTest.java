package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.UserRegistration;

public class UserRegistrationTest {
    @Test
    void testValidUserRegistration() {
        UserRegistration registration = new UserRegistration();

        assertDoesNotThrow(() -> {
            registration.registerUser("john", "john@example.com", "secret1");
        });
    }

    @Test
    void testInvalidUsername() {
        UserRegistration registration = new UserRegistration();

        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "john@example.com", "secret1");
        });
    }

    @Test
    void testInvalidEmail() {
        UserRegistration registration = new UserRegistration();

        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john", "johnexample.com", "secret1");
        });
    }
}

