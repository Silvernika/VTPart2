package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void checkFirstPair() {
        Calculation calculation = new Calculation();
        calculation.x = 1;
        calculation.y = -1;
        assertEquals(1.5, calculation.calculate(), 0.01);
    }

    @Test
    void checkSecondPair() {
        Calculation calculation = new Calculation();
        calculation.x = 3;
        calculation.y = 12;
        assertEquals(3.3, calculation.calculate(), 0.1);

    }

    @Test
    void checkThirdPair(){
        Calculation calculation = new Calculation();
        calculation.x = 5;
        calculation.y = 6;
        assertEquals(5.286, calculation.calculate(), 0.001);
    }
}
