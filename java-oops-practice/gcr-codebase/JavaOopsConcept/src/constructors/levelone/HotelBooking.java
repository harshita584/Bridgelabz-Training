package constructors.levelone;

public class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    public static void main(String[] args) {

        // Using default constructor
        HotelBooking b1 = new HotelBooking();

        // Using parameterized constructor
        HotelBooking b2 = new HotelBooking("Ananya", "Deluxe", 3);

        // Using copy constructor
        HotelBooking b3 = new HotelBooking(b2);

        System.out.println("Booking 1: " + b1.guestName + ", " + b1.roomType + ", " + b1.nights + " night(s)");
        System.out.println("Booking 2: " + b2.guestName + ", " + b2.roomType + ", " + b2.nights + " night(s)");
        System.out.println("Booking 3: " + b3.guestName + ", " + b3.roomType + ", " + b3.nights + " night(s)");
    }
}
