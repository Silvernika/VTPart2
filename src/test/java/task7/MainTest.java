package task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void checkFirsSrtingt() {
        Calculation calculation = new Calculation(new double[]{1,5,3,4,8});
        calculation.calculate();
        double[] array = new double[]{1,3,4,5,8};
        assertArrayEquals(calculation.array, array);
    }
    @Test
    void checkReverseSorting() {
        Calculation calculation = new Calculation(new double[]{5,4,3,2,1});
        calculation.calculate();
        double[] array = new double[]{1,2,3,4,5};
        assertArrayEquals(calculation.array, array);
    }

}
