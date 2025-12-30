/*
 12. Train Reservation Queue 
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

class TrainReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;
        int seatToBook;

        int generalTicket = 30, sleeperTicket = 20, acTicket = 10, economyACTicket = 5;
        System.out.println(
                "\t\t\t\t\t\t\tTickects catogerey Availability \n\t\t\t\t\t\t\t================================");
        System.out.println("\t\t\t\t\t\t\t1.General \t 2.Sleeper \t 3.Ac \t 4.EconomyAC");
        System.out.println("\t\t\tavailavble tickets are\t\t " + generalTicket + "\t\t" + sleeperTicket + "\t\t"
                + acTicket + "\t\t" + economyACTicket);
        while (true) {
            System.out.println("Enter which ticket you want to reserve");
            choice = sc.next();
            switch (choice) {
                case "general", "1":
                    System.out.print("Enter number of tickets that you want to book ");
                    seatToBook = sc.nextInt();
                    if (generalTicket >= seatToBook) {
                        generalTicket -= seatToBook;
                        System.out.println("Successsfully Booked !!");
                    } else {
                        System.out.println(
                                "There is " + generalTicket + " seats and you are trying to book " + seatToBook);
                    }
                    break;
                case "Sleeper", "2":
                    System.out.print("Enter number of tickets that you want to book ");
                    seatToBook = sc.nextInt();
                    if (sleeperTicket >= seatToBook) {
                        sleeperTicket -= seatToBook;
                        System.out.println("Successsfully Booked !!");
                    } else {
                        System.out.println(
                                "There is " + sleeperTicket + " seats and you are trying to book " + seatToBook);
                    }
                    break;
                case "Ac", "3":
                    System.out.print("Enter number of tickets that you want to book ");
                    seatToBook = sc.nextInt();
                    if (acTicket >= seatToBook) {
                        acTicket -= seatToBook;
                        System.out.println("Successsfully Booked !!");
                    } else {
                        System.out.println("There is " + acTicket + " seats and you are trying to book " + seatToBook);
                    }
                    break;
                case "EconomyAC", "4":
                    System.out.print("Enter number of tickets that you want to book ");
                    seatToBook = sc.nextInt();
                    if (economyACTicket >= seatToBook) {
                        economyACTicket -= seatToBook;
                        System.out.println("Successsfully Booked !!");
                    } else {
                        System.out.println(
                                "There is " + economyACTicket + " seats and you are trying to book " + seatToBook);
                    }
                    break;
                default:
                    System.out.println("Wrong choice try again");
            }
            System.out.println(
                    "\t\t\t\t\t\t\tTickects catogerey Availability \n\t\t\t\t\t\t\t================================");
            System.out.println("\t\t\t\t\t\t\t1.General \t 2.Sleeper \t 3.Ac \t 4.EconomyAC");
            System.out.println("\t\t\tavailavble tickets are\t\t " + generalTicket + "\t\t" + sleeperTicket + "\t\t"
                    + acTicket + "\t\t" + economyACTicket);
            System.out.println("Do you want to book another ticket (yes/no)");
            choice = sc.next();
            if (choice.equals("no")) {
                break;
            }
        }
        sc.close();
    }
}