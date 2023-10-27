package task3;

import java.io.IOException;

public class Calculation {
    public double a;
    public double b;
    public double h;
    public double[] result;
    public double[] variables;

    public double calcTang(double x) {
        double result = Math.tan(x);
        return result;
    }

    public void calculate() {
        result = new double[(int) Math.round(Math.abs((b - a) / h)) + 1];
        variables = new double[(int) Math.round(Math.abs((b - a) / h)) + 1];
        double variable = 0;
        if (b > a)
            variable = a;
        else
            variable = b;
        for (int i = 0; i < result.length; i++){
            variables[i] = variable;
            result[i] = calcTang(variable);
            variable += h;
        }
    }
}


