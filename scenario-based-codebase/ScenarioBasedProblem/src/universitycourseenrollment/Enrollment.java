package universitycourseenrollment;

public class Enrollment implements Graded {
    private Student student;
    private Course course;
    private double gradePoint = -1;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        student.addEnrollment(this);
    }

    // Letter grading style
    @Override
    public void assignGrade(double score) {
        if (score >= 90) gradePoint = 10;
        else if (score >= 80) gradePoint = 8;
        else if (score >= 70) gradePoint = 6;
        else gradePoint = 4;
    }

    public double getGradePoint() {
        return gradePoint;
    }
}
