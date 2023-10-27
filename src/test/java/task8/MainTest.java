package task8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void checkInsertion(){
        List<Double> first = Arrays.asList(new Double[]{3.0, 4.0, 8.0, 9.0, 12.0});
        List<Double> second = Arrays.asList(new Double[]{4.0, 5.0, 10.0, 12.0, 15.0});
        Calculation calculation = new Calculation(first, second);
        calculation.calculate();
        List<Integer> result = Arrays.asList(new Integer[]{1,3,6,7,9});
        assertEquals(calculation.result,result);
    }
    @Test
    void checkReverseInsertion(){
        List<Double> first = Arrays.asList(new Double[]{4.0, 5.0, 10.0, 12.0, 15.0});
        List<Double> second = Arrays.asList(new Double[]{3.0, 4.0, 8.0, 9.0, 12.0});
        Calculation calculation = new Calculation(first, second);
        calculation.calculate();
        List<Integer> result = Arrays.asList(new Integer[]{0,1,4,5,7});
        assertEquals(calculation.result,result);
    }

}
