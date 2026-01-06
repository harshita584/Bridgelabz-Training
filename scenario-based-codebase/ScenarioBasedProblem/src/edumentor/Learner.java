package edumentor;

public class Learner extends User implements ICertifiable {

    private String courseType; // "SHORT" or "FULL_TIME"

    public Learner(String name, String email, String userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("SHORT")) {
            System.out.println("Certificate of Completion issued");
        } else {
            System.out.println("Professional Diploma Certificate issued");
        }
    }
}
