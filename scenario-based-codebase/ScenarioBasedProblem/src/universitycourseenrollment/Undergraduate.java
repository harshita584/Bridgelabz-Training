package universitycourseenrollment;

public class Undergraduate extends Student {

    public Undergraduate(int id, String name) {
        super(id, name);
    }

    public Undergraduate(int id, String name, String elective) {
        super(id, name, elective);
    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate Student: " + name);
    }
}