package TestCases;

import org.junit.jupiter.api.Test;

import com.junit.StringUtils;

import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsTest {
    @Test
    void testReverse() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.reverse("abc");
        assertEquals("cba", result);
    }

    @Test
    void testIsPalindromeTrue() {
        StringUtils stringUtils = new StringUtils();
        boolean result = stringUtils.isPalindrome("madam");
        assertTrue(result);
    }

    @Test
    void testIsPalindromeFalse() {
        StringUtils stringUtils = new StringUtils();
        boolean result = stringUtils.isPalindrome("hello");
        assertFalse(result);
    }

    @Test
    void testToUpperCase() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.toUpperCase("hello");
        assertEquals("HELLO", result);
    }
}
