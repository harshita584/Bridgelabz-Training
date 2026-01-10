package tourmate;

import java.util.Arrays;

public class TourMateApp {
    public static void main(String[] args) {
    	
        Transport domesticTransport = new Transport("Train", 3000);
        Hotel domesticHotel = new Hotel("Goa Crown", 2500, 4);

        Activity d1 = new Activity("Water Sports", 2000);
        Activity d2 = new Activity("Local Sightseeing", 1000);

        Trip domesticTrip = new DomesticTrip(
                "Goa",
                4,
                domesticTransport,
                domesticHotel,
                Arrays.asList(d1, d2)
        );

        System.out.println("----- DOMESTIC TRIP -----");
        domesticTrip.bookTrip();
        System.out.println("Total Budget: ₹" + domesticTrip.getBudget());

        System.out.println();

        Transport transport = new Transport("Flight", 15000);
        Hotel hotel = new Hotel("Palm Jumerah", 40000, 5);

        Activity a1 = new Activity("Desert Safari", 3000);
        Activity a2 = new Activity("City Tour", 1500);
        Trip trip = new InternationalTrip(
                "Dubai", 5,
                transport,
                hotel,
                Arrays.asList(a1, a2)
        );
        System.out.println("----- INTERNATIONAL TRIP -----");
        trip.bookTrip();
        System.out.println("Total Trip Budget: " + trip.getBudget());
    }
}

