package task6;

public class Calculation {
    static int arraySize;
    double[] array;
    double[][] matrix;

    public Calculation(double[] array){
        arraySize = array.length;
        this.array = array;
        matrix = new double[arraySize][arraySize];
    }

    public void calculate(){
        int index = 0;
        for (int row = 0; row < arraySize; row++){
            index = row;
            for (int i = 0; i < arraySize; i++){
                matrix[row][i] = array[index];
                index++;
                if (index == arraySize)
                    index = 0;
            }
        }
    }
}
