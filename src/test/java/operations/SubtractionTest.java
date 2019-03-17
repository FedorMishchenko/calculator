package operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {

    @Test
    public void calculate() {
        Float expected = 2.0f;
        assertEquals(expected,
                new Subtraction().calculate(5.0f,3.0f));
    }
}