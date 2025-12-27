package constructors.levelone;

//Subclass
class Manager extends Employee {

 Manager(int employeeID, String department, double salary) {
     super(employeeID, department, salary);
 }

 void display() {
     System.out.println("Employee ID: " + employeeID);   // public
     System.out.println("Department: " + department);    // protected
     System.out.println("Salary: " + getSalary());        // private via method
 }

 public static void main(String[] args) {

     Manager m = new Manager(201, "IT", 60000);

     m.display();

     // Modify salary
     m.setSalary(75000);
     System.out.println("Updated Salary: " + m.getSalary());
 }
}