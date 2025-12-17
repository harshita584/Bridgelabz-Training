//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM.

public class SamAverageMark
{
    // Main method: program execution starts here
    public static void main(String args[])
    {
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        //calculating the average mark
        int averagePercent = (mathsMarks+physicsMarks+chemistryMarks)/3;

        //Display the average percent mark of Sam
        System.out.println("Sam’s average mark in PCM is "+averagePercent);
         
    }
}

