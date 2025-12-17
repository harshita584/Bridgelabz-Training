// Write a program the find the distance in yards and miles for the distance provided by user in feets
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet

import java.util.Scanner;
public class FeetToYardsAndMiles{
    public static void main(String args[]){
      
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter distance in feet: ");
       double distanceInFeet = sc.nextDouble();

       double distanceInYards = distanceInFeet / 3;
       double distanceInMile = distanceInYards / 1760;

       //Display the output
       System.out.println("Distance in feet : " + distanceInFeet);
       System.out.println("Distance in Yards : " + distanceInYards);
       System.out.println("Distance in Miles : " + distanceInMile);
      }
}


     