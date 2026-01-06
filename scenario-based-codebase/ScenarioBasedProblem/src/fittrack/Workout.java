package fittrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // minutes
    protected double caloriesBurned;

    // Internal logs – not exposed
    protected Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        caloriesBurned = calculateCalories();
        System.out.println(type + " workout ended");
    }

    // Polymorphic method
    protected abstract double calculateCalories();

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}

