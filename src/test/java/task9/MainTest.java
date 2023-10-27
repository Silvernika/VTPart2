package task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void checkBallsAmount() {
        Main calculation = new Main();
        int weight = 140;
        int blueBalls = 3;
        calculation.main(null);
        assertEquals(calculation.ballsWeight, weight);
        assertEquals(calculation.blueBalls, blueBalls);
    }
}
