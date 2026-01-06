package eventease;

public class User {

    private String userId;
    private String name;
    private String email; // sensitive

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    // email not exposed directly
    public String getMaskedEmail() {
        return "****" + email.substring(email.indexOf("@"));
    }
}
