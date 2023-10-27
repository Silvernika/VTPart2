package task9;

public class Main {
    static int ballsWeight;
    static int blueBalls;
    public static void main(String[] args){
        Basket basket = new Basket();
        basket.addBall(new Ball(34, "Blue"));
        basket.addBall(new Ball(15, "Red"));
        basket.addBall(new Ball(10, "Blue"));
        basket.addBall(new Ball(53, "Yellow"));
        basket.addBall(new Ball(28, "Blue"));
        ballsWeight = countWeight(basket);
        System.out.println("The weight of all balls in the basket: " + ballsWeight);
        System.out.println("The amount of blue balls in the basket: " + blueBalls);
    }

    public static int countWeight(Basket basket){
        int weight = 0;
        for(Ball ball:basket.getBallsList()) {
            weight += ball.getWeight();
            if (ball.getColor().equals("Blue"))
                blueBalls++;
        }
        return weight;
    }
}
