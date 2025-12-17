// Program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024.


public class AgeOfHarry
{
   //static method to calculate the age of Harry
   static int harryAge(int birthYear, int currentYear)
   {
       return currentYear-birthYear;
   }


    // Main method: program execution starts here
    public static void main(String args[])
    {
        int birthYear = 2000;
        int currentYear = 2024;
        //storing the age of harry in variable ageOfHarry
        int ageOfHarry = harryAge(birthYear, currentYear);
        //Display the age of Harry
        System.out.println("Harry's age in 2024 is "+ageOfHarry);
         
    }
}
