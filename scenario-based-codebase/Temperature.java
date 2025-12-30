/*Temperature Logger 
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.*/

import java.util.Scanner;
public class Temperature{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       // array to store the temperature for 7 days
       double temperature[] = new double[7];
       for(int i=0; i<7; i++)
       {
         System.out.println("Enter the temperature of day " + (i+1));
         temperature[i] = sc.nextDouble();  
       }
 
       double sum=0; double max = temperature[0];
       // loop to find the maximum temperature over 7 days
       for(int i=0; i<7; i++)
       {
         sum = sum + temperature[i];
         if(max<temperature[i])
         {
           max = temperature[i]; 
         }
       }
      double avgTemperature = sum/7;
      // Displaying the output
      System.out.println("The average Temperature is: " + avgTemperature);
      System.out.println("The maximum Temperature is: " + max);
   }
}

       
