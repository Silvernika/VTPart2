package task4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @Test
    void checkPlaces1() {
        Calculation calculation = new Calculation(new int[]{1,2,3,4,5});
        calculation.calculate();
        List<Integer> places = Arrays.asList(1,2,4);
        assertEquals(calculation.answer, places);
    }

    @Test
    void checkPlaces2() {
        Calculation calculation = new Calculation(new int[]{0,10,89,123,7});
        calculation.calculate();
        List<Integer> places = Arrays.asList(2,4);
        assertEquals(calculation.answer, places);
    }
    @Test

    void checkNoPlaces() {
        Calculation calculation = new Calculation(new int[]{20,30,49,100,70});
        calculation.calculate();
        List<Integer> places = Arrays.asList();
        assertEquals(calculation.answer, places);
    }

}
