
package campusconnect;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

    private ArrayList<Double> grades;  
    private double gpa;

    public Student(int id, String name, String email) {
        super(name, email, id);
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
        calculateGPA();
    }

    private void calculateGPA() {
        double sum = 0;
        for (double g : grades) {
            sum += g;                
        }
        gpa = (grades.size() > 0) ? sum / grades.size() : 0; 
    }
    public void enrollCourse(Course course) {
        course.addStudent(this);// this represent the current calling object
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void dropCourse(Course course) {
        course.removeStudent(this);
        System.out.println(name + " dropped " + course.getCourseName());
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("GPA: " + gpa);
    }
}
