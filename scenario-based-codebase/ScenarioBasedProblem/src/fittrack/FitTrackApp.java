package fittrack;

public class FitTrackApp {

    public static void main(String[] args) {

        UserProfile user = new UserProfile(
                "Ali", 24,70.5,"Weight Loss",2500 );

        Workout cardio = new CardioWorkout(30);
        cardio.startWorkout();
        cardio.stopWorkout();

        System.out.println("Calories Burned: " + cardio.getCaloriesBurned());

        ProgressTracker.showProgress(user, cardio.getCaloriesBurned());
    }
}

