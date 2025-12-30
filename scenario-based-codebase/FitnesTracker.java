/*Sandeep’s Fitness Challenge Tracker 
Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.*/

import java.util.Scanner;
public class FitnesTracker{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int pushups[] = new int[7];
      
      System.out.println("Sandeep's Fitness Challenge Tracker");
      System.out.println("Enter the count of pushups till the week (0 for restday)");

      for(int i=0; i<7; i++)
      {
          System.out.println("The count of pushup for day " + (i+1) + ":");
          pushups[i] = sc.nextInt();
      }

      int totalPushUps=0;
      int activeDays=0;
   
      // for-each loop
      for (int dailyCount : pushups) {
      // Skip rest days
      if (dailyCount == 0) {
             continue;
         }

           totalPushUps += dailyCount;
           activeDays++;
        }

        double average = totalPushUps / activeDays;

        System.out.println("\n Weekly Summary");
        System.out.println("Total Push-ups (excluding rest days): " + totalPushUps);
        System.out.println("Average Push-ups per active day: " + average);
    }
}
      
         
       
        
     
