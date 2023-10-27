package task2;

public class Calculation {
    public double rectangle1X1 = -4;
    public double rectangle1X2 = 4;
    public double rectangle1Y1 = 0;
    public double rectangle1Y2 = 5;
    public double rectangle2X1 = -6;
    public double rectangle2X2 = 6;
    public double rectangle2Y1 = 0;
    public double rectangle2Y2 = -3;
    public double x;
    public double y;

    public boolean isFirstRectangle(double x, double y) {
        if ((x >= rectangle1X1 && x <= rectangle1X2) && (y >= rectangle1Y1 && y <= rectangle1Y2))
            return true;

        else
            return false;
    }

    public boolean isSecondRectangle(double x, double y) {
        if (( x >= rectangle2X1 && x <= rectangle2X2) && (y <= rectangle2Y1 && y >= rectangle2Y2))
            return true;
        else
            return false;
    }

    public boolean calculate(double x, double y) {
        return isFirstRectangle(x, y) || isSecondRectangle(x, y);
    }
}
