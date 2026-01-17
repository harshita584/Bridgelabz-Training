package geoMeasure;

public class LineComparator {

    // method to compare two lines
    public static void compareLines(Line l1, Line l2)
    {
        double length1 = l1.calculateLength();
        double length2 = l2.calculateLength();

        if(length1 == length2)
        {
            System.out.println("Both lines are of equal length.");
        }
        else if(length1 > length2)
        {
            System.out.println("Line 1 is longer than Line 2.");
        }
        else
        {
            System.out.println("Line 2 is longer than Line 1.");
        }
    }
}
