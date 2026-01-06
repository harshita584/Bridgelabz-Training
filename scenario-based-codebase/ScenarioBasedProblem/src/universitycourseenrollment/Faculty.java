package universitycourseenrollment;

public class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    // Pass/Fail grading
    public void assignPassFailGrade(Graded enrollment, double score) {
        if (score >= 50) {
            enrollment.assignGrade(60); // treated as pass
        } else {
            enrollment.assignGrade(0);  // fail
        }
    }

    // Letter grading
    public void assignLetterGrade(Graded enrollment, double score) {
        enrollment.assignGrade(score);
    }
}
