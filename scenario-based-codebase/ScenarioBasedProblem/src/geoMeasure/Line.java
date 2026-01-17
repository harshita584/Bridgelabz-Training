package geoMeasure;

public class Line {

    // encapsulated data members
    private double x1, y1, x2, y2;

    // constructor using this keyword
    public Line(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // method to calculate length of line
    public double calculateLength()
    {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
