package task7;

public class Calculation {
    static int arraySize;
    double[] array;

    public Calculation(double[] array){
        arraySize = array.length;
        this.array = array;
    }

    public void calculate(){
        int i = 0;
        double swap;
        while (i < arraySize-1){
            if (array[i] <= array[i+1])
                i++;
            else {
                swap = array[i];
                array[i] = array[i+1];
                array[i+1] = swap;
                if (i != 0)
                i--;
            }
        }
    }
}
