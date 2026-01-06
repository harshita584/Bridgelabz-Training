package eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String location, String date,
                          int attendees, User organizer) {
        super(eventId, "Birthday Party", location, date, attendees, organizer, 5000, 1000);
    }

    @Override
    public void schedule() {
        System.out.println("🎉 Birthday event scheduled with cake & decorations!");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}

