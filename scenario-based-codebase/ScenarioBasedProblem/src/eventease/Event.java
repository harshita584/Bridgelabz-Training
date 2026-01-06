package eventease;

public abstract class Event implements ISchedulable {

    private final int eventId;     // cannot be changed
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    // Encapsulated pricing
    private double venueCost;
    private double serviceCost;
    private double discount;

    // Constructor without services
    public Event(int eventId, String eventName, String location,
                 String date, int attendees, User organizer) {

        this(eventId, eventName, location, date, attendees, organizer, 0, 0);
    }

    // Constructor with catering/decoration
    public Event(int eventId, String eventName, String location,
                 String date, int attendees, User organizer,
                 double serviceCost, double discount) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = attendees * 200; // base venue cost
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Read-only eventId
    public int getEventId() {
        return eventId;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public void showDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
