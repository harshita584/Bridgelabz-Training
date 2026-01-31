package TestCases;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import com.junit.PasswordValidator;

public class PasswordValidatorTest {
    @Test
    void testValidPassword() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid("Password1");
        assertTrue(result);
    }

    @Test
    void testPasswordTooShort() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid("Pass1");
        assertFalse(result);
    }

    @Test
    void testPasswordWithoutUppercase() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid("password1");
        assertFalse(result);
    }

    @Test
    void testPasswordWithoutDigit() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid("Password");
        assertFalse(result);
    }
}

