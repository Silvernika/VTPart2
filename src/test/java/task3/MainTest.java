package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {


    @Test
    void checkReverseArray() {
        Calculation calculation = new Calculation();
        calculation.a = 7;
        calculation.b = 5;
        calculation.h = 0.5;
        calculation.calculate();
        double[] results = new double[]{-3.38, -0.99, -0.29, 0.22, 0.87};
        double[] variables = new double[]{5, 5.5, 6, 6.5, 7};
        assertArrayEquals(variables, calculation.variables);
        assertArrayEquals(results, calculation.result, 0.1);

    }

    @Test
    void checkArray() {
        Calculation calculation = new Calculation();
        calculation.a = 3;
        calculation.b = 6;
        calculation.h = 1;
        calculation.calculate();
        double[] results = new double[]{-0.14, 1.15, -3.38, -0.29};
        double[] variables = new double[]{3, 4, 5, 6};
        assertArrayEquals(variables, calculation.variables);
        assertArrayEquals(results, calculation.result, 0.1);
    }
}
