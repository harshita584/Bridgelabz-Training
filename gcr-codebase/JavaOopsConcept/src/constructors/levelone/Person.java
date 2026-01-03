package constructors.levelone;

public class Person {

    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public static void main(String[] args) {

        Person p1 = new Person("Rahul", 25);

        // Creating a copy of p1
        Person p2 = new Person(p1);

        System.out.println("Original Person: " + p1.name + ", " + p1.age);
        System.out.println("Cloned Person: " + p2.name + ", " + p2.age);
    }
}
