package com.linkedlist.circularlinkedlist;

public class TicketReservationSystem {

    // Node representing a booked ticket
    static class Ticket {
        int ticketId;
        String customerName;
        String movieName;
        String seatNumber;
        String bookingTime;
        Ticket next;

        Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
            this.next = null;
        }
    }

    Ticket head = null;

    // Add ticket at end
    void addTicket(int id, String customer, String movie, String seat, String time) {
        Ticket t = new Ticket(id, customer, movie, seat, time);

        if (head == null) {
            head = t;
            t.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = t;
            t.next = head;
        }
        System.out.println("Ticket booked successfully!");
    }

    // Remove ticket by ID
    void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets to remove");
            return;
        }

        Ticket curr = head, prev = null;

        do {
            if (curr.ticketId == id) {

                // single ticket
                if (curr == head && curr.next == head) {
                    head = null;
                    System.out.println("Ticket removed");
                    return;
                }

                // removing head
                if (curr == head) {
                    Ticket last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket removed");
                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket ID not found");
    }

    // Display all tickets
    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Ticket temp = head;
        System.out.println("\nBooked Tickets:");
        do {
            System.out.println("ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                    ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer or movie
    void searchTicket(String name) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name) || temp.movieName.equalsIgnoreCase(name)) {
                System.out.println("ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                        ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for \"" + name + "\"");
    }

    // Count total tickets
    void totalTickets() {
        if (head == null) {
            System.out.println("Total booked tickets: 0");
            return;
        }

        int count = 0;
        Ticket temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total booked tickets: " + count);
    }

    // Main method for testing
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(1, "Alice", "Spider-Man", "A1", "10:00 AM");
        system.addTicket(2, "Bob", "Avengers", "B2", "10:30 AM");
        system.addTicket(3, "Charlie", "Spider-Man", "C3", "11:00 AM");

        system.displayTickets();

        system.searchTicket("Spider-Man");
        system.searchTicket("Bob");

        system.totalTickets();

        system.removeTicket(2);
        system.displayTickets();
        system.totalTickets();
    }
}
