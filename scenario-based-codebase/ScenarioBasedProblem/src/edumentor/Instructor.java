package edumentor;

public class Instructor extends User {

    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void createCourse() {
        System.out.println("Course created by instructor");
    }
}

