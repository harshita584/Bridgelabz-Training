package constructors.levelone;

//Employee class
public class Employee {

 public int employeeID;        // public
 protected String department;  // protected
 private double salary;        // private

 // Constructor
 Employee(int employeeID, String department, double salary) {
     this.employeeID = employeeID;
     this.department = department;
     this.salary = salary;
 }

 // Getter for salary
 public double getSalary() {
     return salary;
 }

 // Public method to modify salary
 public void setSalary(double salary) {
     this.salary = salary;
 }
}