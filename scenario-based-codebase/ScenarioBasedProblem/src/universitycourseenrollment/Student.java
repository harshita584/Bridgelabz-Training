package universitycourseenrollment;

import java.util.ArrayList;
import java.util.List;

public abstract class Student {
    protected int studentId;
    protected String name;
    private double gpa; // secured
    protected List<Enrollment> enrollments;

    // Normal constructor
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrollments = new ArrayList<>();
    }

    // Constructor with elective preference
    public Student(int studentId, String name, String electivePreference) {
        this(studentId, name);
        System.out.println(name + " prefers elective: " + electivePreference);
    }

    protected void calculateGPA() {
        double totalPoints = 0;
        int count = 0;

        for (Enrollment e : enrollments) {
            if (e.getGradePoint() >= 0) {
                totalPoints += e.getGradePoint();
                count++;
            }
        }

        gpa = (count == 0) ? 0 : totalPoints / count;
    }

    public String getTranscript() {
        calculateGPA();
        return "Student: " + name + ", GPA: " + gpa;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public abstract void displayInfo();
}