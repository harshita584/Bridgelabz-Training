package campusconnect;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
    private int courseId;
    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;
    

    public Course(int courseId, String courseName, Faculty faculty) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.faculty = faculty;
        students = new ArrayList<>();
    }


	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public String getCourseName() {
		return courseName;
	}

}
