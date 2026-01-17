package bagNBall;

import java.util.ArrayList;

public class BagNBallApp {

    public static void main(String[] args) {

        ArrayList<Bag> bags = new ArrayList<>();

        // create bags
        Bag bag1 = new Bag("B101", "Red", 3);
        Bag bag2 = new Bag("B102", "Blue", 2);

        bags.add(bag1);
        bags.add(bag2);

        // create balls
        Ball ball1 = new Ball("BL1", "Yellow", "Small");
        Ball ball2 = new Ball("BL2", "Green", "Medium");
        Ball ball3 = new Ball("BL3", "Orange", "Large");
        Ball ball4 = new Ball("BL4", "White", "Small");

        // add balls to bags
        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3);
        bag1.addBall(ball4);   // exceeds capacity

        bag2.addBall(ball4);

       
        bag1.displayBalls();

        bag1.removeBall("BL2");
        bag1.displayBalls();

        // display all bags with ball count
        System.out.println("\nAll Bags Information:");
        for(Bag b : bags)
        {
            b.displayInfo();
        }
    }
}
