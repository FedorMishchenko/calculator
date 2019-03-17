package operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void calculate() {
        Float expected = 10.0f;
        assertEquals(expected, new Addition().calculate(4.0f, 6.0f));
    }
}