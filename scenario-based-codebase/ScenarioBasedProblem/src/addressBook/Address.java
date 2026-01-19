package addressBook;

public class Address {

    private String city;
    private String state;
    private String zip;

    public Address(String city, String state, String zip)
    {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String toString()
    {
        return city + ", " + state + " - " + zip;
    }
}
