package constructors.levelone;

public class Course {

    // Instance variables
    String courseName;
    int duration;      // duration in months
    double fee;

    // Class variable (shared by all courses)
    static String instituteName = "Coding Thinker Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java", 6, 6000);
        Course c2 = new Course("Python", 4, 7000);

        c1.displayCourseDetails();
        System.out.println();

        c2.displayCourseDetails();
        System.out.println();

        // Update institute name for all courses
        Course.updateInstituteName("RICR Training Center");

        System.out.println("After updating institute name:\n");
        c1.displayCourseDetails();
    }
}
