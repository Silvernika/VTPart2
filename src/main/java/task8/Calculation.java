package task8;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
    List<Double> firstSequence;
    List<Double> secondSequence;
    List<Integer> result = new ArrayList<>();
    public Calculation(List<Double> array1, List<Double> array2){
        firstSequence = new ArrayList<>();
        firstSequence.addAll(array1);
        secondSequence = new ArrayList<>();
        secondSequence.addAll(array2);
    }

    public void calculate(){
        int i = 0;
        int j = 0;
        while (!secondSequence.isEmpty()){
            if ((firstSequence.get(i) >= secondSequence.get(j) && i == 0)){
                double number = secondSequence.get(j);
                firstSequence.add(i,number);
                secondSequence.remove(j);
                result.add(i);
            }
            if ((firstSequence.get(i) <= secondSequence.get(j) && i == firstSequence.size()-1)|| firstSequence.get(i) <= secondSequence.get(j) && firstSequence.get(i+1) >= secondSequence.get(j)){
                double number = secondSequence.get(j);
                firstSequence.add(i+1,number);
                secondSequence.remove(j);
                result.add(i+1);
            }
            i++;
        }
    }


}
