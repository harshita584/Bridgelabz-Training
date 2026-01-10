package tourmate;

import java.util.List;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel,
                        List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    public void bookTrip() {
        System.out.println("Booking Domestic Trip to " + destination);
        transport.book();
        hotel.book();
        activities.forEach(Activity::book);
    }
}

