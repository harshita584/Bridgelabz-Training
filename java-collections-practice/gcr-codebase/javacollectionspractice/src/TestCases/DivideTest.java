package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.Divide;

public class DivideTest {
    @Test
    void testDivideByZero() {
        Divide obj = new Divide();

        assertThrows(ArithmeticException.class, () -> {
            obj.divide(10, 0);
        });
    }

    @Test
    void testDivideNormally() {
    	Divide obj = new Divide();
        assertEquals(5, obj.divide(10, 2));
    }
}

