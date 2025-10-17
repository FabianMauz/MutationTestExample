package ipbhalle.de.mutationtestexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fmauz
 */
public class CalculatorTest {

    @Test
    public void addTest() {
        assertEquals(3, Calculator.add(1, 2));
    }

    @Test
    public void substractTest() {
        assertEquals(-1, Calculator.substract(1, 2));
    }

    @Test
    public void multiplyTest() {
        assertEquals(2, Calculator.multiply(1, 2));
    }

    @Test
    public void divideTest() {
        assertEquals(.5f, Calculator.divide(1, 2));
    }
}
