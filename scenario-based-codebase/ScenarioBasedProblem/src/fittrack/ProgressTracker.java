package fittrack;

public class ProgressTracker {

    public static void showProgress(UserProfile user, double caloriesBurned) {
        int remaining = user.getDailyTarget() - (int) caloriesBurned;
        System.out.println("Calories remaining today: " + remaining);
    }
}
