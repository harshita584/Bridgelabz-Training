// Write a Program to compute the volume of Earth in km^3 and miles^3
//Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
//O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

// Program to compute the volume of Earth in km^3 and miles^3
public class VolumeOfEarth 
{
    // Main method: program execution starts here
    public static void main(String[] args) 
    {
        // Radius of Earth in kilometers
        double radiusKm = 6378;          
        double pi = Math.PI;

        // Volume of sphere = (4/3) * pi * r^3
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Conversion: 1 km = 0.621371 miles
        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles);
    }
}
