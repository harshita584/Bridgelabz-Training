package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.TemperatureConverter;

public class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.celsiusToFahrenheit(0);
        assertEquals(32.0, result);
    }

    @Test
    void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.fahrenheitToCelsius(32);
        assertEquals(0.0, result);
    }
}
