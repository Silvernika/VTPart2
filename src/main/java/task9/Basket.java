package task9;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Ball> balls = new ArrayList<>();

    public ArrayList<Ball> getBallsList() {
        return balls;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

}
