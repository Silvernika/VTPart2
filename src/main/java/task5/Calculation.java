package task5;


import javax.swing.*;

public class Calculation {
    int deletedElement = 0;
    static int arraySize;
    int[] array;
    int distance[];
    public Calculation(int[] array){
        arraySize = array.length;
        this.array = array;
        distance = new int[arraySize];
    }

    public void findBigSequence() {
      for (int i = 0; i < arraySize; i++){
          distance[i] = 1;
          for (int j = 0; j < i; j++){
              if (array[j] < array[i] && (distance[j] + 1 > distance[i]))
              distance[i] = distance[j] + 1;
          }
      }
    }

    public void calculate(){
        findBigSequence();
        int result = 0;
        for (int i = 0; i < arraySize; i++){
            if (distance[i] > result)
                result = distance[i];
        }
        deletedElement = arraySize - result;
    }

}
