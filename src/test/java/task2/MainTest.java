package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void checkRightDown() {
        Calculation calculation = new Calculation();
        calculation.x = 1;
        calculation.y = -1;
        assertTrue(calculation.calculate(calculation.x, calculation.y));
    }

    @Test
    void checkRightUp() {
        Calculation calculation = new Calculation();
        calculation.x = 4;
        calculation.y = 4;
        assertTrue(calculation.calculate(calculation.x, calculation.y));
    }

    @Test
    void checkCenter() {
        Calculation calculation = new Calculation();
        calculation.x = 0;
        calculation.y = 0;
        assertTrue(calculation.calculate(calculation.x, calculation.y));
    }

    @Test
    void checkOutOfRectangle() {
        Calculation calculation = new Calculation();
        calculation.x = 10;
        calculation.y = 5;
        assertFalse(calculation.calculate(calculation.x, calculation.y));
    }
}

