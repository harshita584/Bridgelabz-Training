/*Bus Route Distance Tracker 
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation. */


import java.util.Scanner;

public class DistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stopCount = 0;
        int totalDistance = 0;
        char choice = 'n';

        // Array to store distance of each stop (max 100 stops assumed)
        int[] stopDistances = new int[100];

        System.out.println("Bus Route Distance Tracker");

        // Continue until passenger gets off
        while (choice != 'y' && choice != 'Y') {

            // Generate random distance between 1 and 15 km
            int distanceThisStop = (int) (Math.random() * 15) + 1;

            stopDistances[stopCount] = distanceThisStop;
            totalDistance += distanceThisStop;
            stopCount++;

            System.out.println("\nBus has reached Stop " + stopCount);
            System.out.print("Do you want to get off at this stop? (y/n): ");
            choice = sc.next().charAt(0);
        }

        // Display summary after passenger gets off
        System.out.println("\nPassenger got off the bus");
        System.out.println("Distance covered at each stop:");

        for (int i = 0; i < stopCount; i++) {
            System.out.println("Stop " + (i + 1) + ": " + stopDistances[i] + " km");
        }

        System.out.println("\nTotal distance travelled: " + totalDistance + " km");

        sc.close();
    }
}     