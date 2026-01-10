package tourmate;

import java.util.List;

public abstract class Trip {

    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected List<Activity> activities;

    public Trip(String destination, int duration,
                Transport transport, Hotel hotel,
                List<Activity> activities) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activities = activities;

        calculateTotalBudget();
    }

    protected void calculateTotalBudget() {
        double activityCost = 0;
        for (Activity activity : activities) {
            activityCost += activity.getCost();
        }

        budget = transport.getCost()
                + hotel.getCost()
                + activityCost;
    }

    public double getBudget() {
        return budget;
    }

    public abstract void bookTrip();
}

