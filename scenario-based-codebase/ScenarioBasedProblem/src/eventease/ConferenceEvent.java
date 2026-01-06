package eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String location, String date,
                            int attendees, User organizer) {
        super(eventId, "Conference", location, date, attendees, organizer, 15000, 3000);
    }

    @Override
    public void schedule() {
        System.out.println("📢 Conference scheduled with AV & seating arrangements.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference event cancelled.");
    }
}
