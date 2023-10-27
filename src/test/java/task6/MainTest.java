package task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void checkTypicalMatrix() {
        Calculation calculation = new Calculation(new double[]{1,5,3,4,8});
        calculation.calculate();
        double[][] array = new double[][]{{1,5,3,4,8}, {5,3,4,8,1}, {3,4,8,1,5}, {4,8,1,5,3}, {8,1,5,3,4}};
        assertArrayEquals(calculation.matrix, array);
    }
    @Test
    void checkOneElement() {
        Calculation calculation = new Calculation(new double[]{7});
        calculation.calculate();
        double[][] array = new double[][]{{7}};
        assertArrayEquals(calculation.matrix, array);
    }
}
