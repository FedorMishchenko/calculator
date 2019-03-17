package operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void calculate() {
        Float expected = 4.0f;
        assertEquals(expected,
                new Multiplication().calculate(2.0f,2.0f));
    }
}