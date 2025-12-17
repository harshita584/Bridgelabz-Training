// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.

public class DividePen
{
    // Main method: program execution starts here
    public static void main(String args[])
    {
        int totalPens = 14;
        int students = 3;

        //Using Division Operator to find the Quantity of pens
        int pensPerStudent = totalPens / students;

        //Using Modulus Operator (%) to find the reminder.
        int remainingPens = totalPens % students;

        //Display the output
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
         
    }
}
