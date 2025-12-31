/* Digital Watch Simulation 
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements */


public class WatchSimulation{
    public static void main(String args[]){
        int hour=0;
        int minute=0;
        // Print hours and minutes in a nested for-loop
        for(int i=hour; i<24; i++)
        {
            // loop for an minute
            for(int j=minute; j<60; j++)
            {
               System.out.printf("%02d:%02d\n", i, j);
             // Used a break to stop at 13:00 manually
             if(i==13 && j==0)
             {
               break;
             }
            }
          // breaking the outer for loop 
          if(i==13)
          {
            break;
          }
        }
   }
}