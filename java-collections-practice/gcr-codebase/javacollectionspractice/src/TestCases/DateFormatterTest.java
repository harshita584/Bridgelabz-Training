package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.DateFormatter;

public class DateFormatterTest {
    @Test
    void testValidDate() {
        DateFormatter formatter = new DateFormatter();
        String result = formatter.formatDate("2024-01-15");
        assertEquals("15-01-2024", result);
    }

    @Test
    void testAnotherValidDate() {
        DateFormatter formatter = new DateFormatter();
        String result = formatter.formatDate("2023-12-31");
        assertEquals("31-12-2023", result);
    }

    @Test
    void testInvalidDateFormat() {
        DateFormatter formatter = new DateFormatter();
        String result = formatter.formatDate("15-01-2024");
        assertNull(result);
    }

    @Test
    void testInvalidDateValue() {
        DateFormatter formatter = new DateFormatter();
        String result = formatter.formatDate("2024-13-40");
        assertNull(result);
    }
}
