/*
 * Parking Lot Gate System 
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
 */

import java.util.Scanner;
public class ParkingLot {
	
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            final int slots = 15;
            int occupancy = 0;
            
            // while loop to continue until the parking lot is full or the user exits
            while(occupancy < slots){
            System.out.println("Enter the choice in number(1/park, 2/exit, 3/showOccupancy, 4/exitSystem): ");
            int choice = sc.nextInt();

            // using switch case for the menu
            switch(choice)
            {
            case 1:
              System.out.println("Vehicle Parked.");
              occupancy++;
                if(occupancy == slots){
                    System.out.println("Slots are filled.");
                    }
              break;
            case 2:
              if(occupancy == 0){
                   System.out.println("Parking lot is empty.");
                   break;
                  }
              else{
                  System.out.println("Vehicle exit.");
                  occupancy--;
                  break;
                  }
            case 3:
              System.out.println("Occupancy is: " + occupancy);
              System.out.println("Remaining slots are: " + (slots-occupancy));
              break;
            case 4:
              System.out.println("ThankYou for using our Application.");
              System.exit(0);
            default:
              System.out.println("Invalid Input, please enter the correct input.");
           }
       }

    }
}
