package eventease;

public class EventEaseApp {

    public static void main(String[] args) {

        User user = new User("U101", "Harshita", "harshita@gmail.com");

        Event birthday = new BirthdayEvent(
                1, "Banquet Hall", "10-Aug-2026", 50, user);

        Event conference = new ConferenceEvent(
                2, "Convention Center", "15-Sep-2026", 200, user);

        Event[] events = { birthday, conference };

        for (Event e : events) {
            e.schedule();          // polymorphism
            e.showDetails();
        }
    }
}

