package tourmate;

import java.util.List;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel,
                             List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    public void bookTrip() {
        System.out.println("Booking International Trip to " + destination);
        System.out.println("Passport and Visa verification required");
        transport.book();
        hotel.book();
        activities.forEach(Activity::book);
    }
}
