package operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void calculate() {
        Float expected = 5.0f;
        assertEquals(expected, new Division().calculate(10.0f, 2.0f));
    }
}