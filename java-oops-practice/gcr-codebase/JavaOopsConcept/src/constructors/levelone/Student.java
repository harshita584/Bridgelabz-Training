package constructors.levelone;

//Student class
public class Student {

 public int rollNumber;     // public
 protected String name;     // protected
 private double cgpa;       // private

 // Constructor
 Student(int rollNumber, String name, double cgpa) {
     this.rollNumber = rollNumber;
     this.name = name;
     this.cgpa = cgpa;
 }

 // Getter for CGPA
 public double getCGPA() {
     return cgpa;
 }

 // Setter for CGPA
 public void setCGPA(double cgpa) {
     this.cgpa = cgpa;
 }
}
