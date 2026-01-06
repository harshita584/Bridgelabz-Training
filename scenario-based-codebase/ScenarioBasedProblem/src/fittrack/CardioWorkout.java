package fittrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    protected double calculateCalories() {
        return duration * 8.0; // calories per minute
    }
}
