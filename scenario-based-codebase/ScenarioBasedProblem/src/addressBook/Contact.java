package addressBook;

public class Contact {

    // encapsulated fields
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;   // composition

    // constructor
    public Contact(String firstName, String lastName,
                   String phone, String email, Address address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // getters
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Address getAddress()
    {
        return address;
    }

    // setters for editing
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void display()
    {
        System.out.println(firstName + " " + lastName +
                " | Phone: " + phone +
                " | Email: " + email +
                " | Address: " + address);
    }
}
