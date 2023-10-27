package task1;

public class Calculation {
    public double x;
    public double y;

    public double calcNumerator(double x, double y) {
       double result = Math.sin(x + y);
       result = Math.pow(result, 2);
       result += 1;
       return result;
    }

    public double calcDenominator(double x, double y){
        double fraction = 2 * x / (1 + Math.pow(x * y, 2));
        fraction = Math.abs(x - fraction);
        double result = 2 + fraction;
        return result;
    }

    public double calculate() {
        double numerator = calcNumerator(x, y);
        double denominator = calcDenominator(x, y);
        double result = numerator / denominator + x;
        return result;
    }
}
