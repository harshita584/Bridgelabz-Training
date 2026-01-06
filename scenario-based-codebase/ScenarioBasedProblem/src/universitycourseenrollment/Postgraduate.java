package universitycourseenrollment;

public class Postgraduate extends Student {

    public Postgraduate(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Postgraduate Student: " + name);
    }
}
