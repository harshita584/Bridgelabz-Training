package callcenter;

public class Customer {
    private String name;
    private boolean isVIP;

    public Customer(String name, boolean isVIP) {
        this.name = name;
        this.isVIP = isVIP;
    }

    public String getName() {
        return name;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public String toString() {
        return "Customer: " + name + (isVIP ? " [VIP]" : " [Regular]");
    }
}