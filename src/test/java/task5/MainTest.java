package task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void checkOneNumber() {
        Calculation calculation = new Calculation(new int[]{1,5,3,4,8});
        calculation.calculate();
        assertEquals(calculation.deletedElement, 1);
    }

    @Test
    void checkNoNumber() {
        Calculation calculation = new Calculation(new int[]{1,2,3,4,8});
        calculation.calculate();
        assertEquals(calculation.deletedElement, 0);
    }

    @Test
    void checkTwoNumbers() {
        Calculation calculation = new Calculation(new int[]{9, 1, 2, 3, 2});
        calculation.calculate();
        assertEquals(calculation.deletedElement, 2);
    }
}
