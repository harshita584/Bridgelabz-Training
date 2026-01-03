package constructors.levelone;

public class Circle {

    double radius;

    // Default constructor
    Circle() {
        this(1.0);   // constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {

        // Using default constructor
        Circle c1 = new Circle();
        System.out.println("Radius using default constructor: " + c1.radius);

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);
        System.out.println("Radius using parameterized constructor: " + c2.radius);
    }
}
