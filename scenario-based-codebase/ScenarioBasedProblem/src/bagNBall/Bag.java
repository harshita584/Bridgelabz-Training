package bagNBall;

import java.util.ArrayList;

public class Bag implements Storable {

    // encapsulated fields
    private String bagId;
    private String color;
    private int capacity;

    // Bag HAS-A list of balls (composition)
    private ArrayList<Ball> balls = new ArrayList<>();

    // constructor
    public Bag(String bagId, String color, int capacity)
    {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
    }

    // add ball to bag
    public void addBall(Ball ball)
    {
        if(balls.size() < capacity)
        {
            balls.add(ball);
            System.out.println("Ball added to bag " + bagId);
        }
        else
        {
            System.out.println("Bag is full. Cannot add more balls.");
        }
    }

    // remove ball by ID
    public void removeBall(String ballId)
    {
        balls.removeIf(b -> b.getBallId().equals(ballId));
        System.out.println("Ball removed if ID matched.");
    }

    // display all balls in bag
    public void displayBalls()
    {
        System.out.println("Balls in Bag " + bagId + ":");
        for(Ball b : balls)
        {
            b.displayInfo();
        }
    }

    // get ball count
    public int getBallCount()
    {
        return balls.size();
    }

    // interface method
    public void displayInfo()
    {
        System.out.println("Bag ID: " + bagId +
                           ", Color: " + color +
                           ", Capacity: " + capacity +
                           ", Balls Stored: " + balls.size());
    }
}
