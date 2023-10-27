package task4;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
    static int arraySize;
    int[] array;
    List<Integer> answer = new ArrayList<>();
    public Calculation(int[] array){
        arraySize = array.length;
        this.array = array;
    }

    public boolean isPrime(int number) {
        if (number == 1)
            return false;
        if (number % 2 == 0 && number != 2)
        return false;
        else {
            int i = 2;
            while (i <= Math.sqrt((float)number)){
                for (int j = i; j <= Math.sqrt((float)number); j +=j){
                    if (number % j == 0)
                        return false;
                }
                i += 1;
            }
            return true;
        }
    }

    public void calculate() {
        for (int i = 0; i < arraySize; i++){
            if (isPrime(array[i]))
                answer.add(i);
        }
    }
}
