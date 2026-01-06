package fittrack;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    protected double calculateCalories() {
        return duration * 6.0;
    }
}

