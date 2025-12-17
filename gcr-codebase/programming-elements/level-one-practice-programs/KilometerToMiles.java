// Create a program to convert the distance of 10.8 kilometers to miles.

public class KilometerToMiles
{
    // Main method: program execution starts here
    public static void main(String args[])
    {
        double km = 10.8;

        // Given: 1 km = 1.6 miles
        double miles = km * 1.6;
       
        //Display the output
        System.out.println("The distance " + km + " km in miles is " + miles);         
    }
}
