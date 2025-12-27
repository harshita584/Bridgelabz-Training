package constructors.levelone;

//Subclass
class PostgraduateStudent extends Student {

 PostgraduateStudent(int rollNumber, String name, double cgpa) {
     super(rollNumber, name, cgpa);
 }

 void display() {
     System.out.println("Roll Number: " + rollNumber); // public
     System.out.println("Name: " + name);              // protected
     System.out.println("CGPA: " + getCGPA());         // private via method
 }

 public static void main(String[] args) {

     PostgraduateStudent ps = new PostgraduateStudent(1, "Aman", 8.5);

     ps.display();

     // Modify CGPA
     ps.setCGPA(9.0);
     System.out.println("Updated CGPA: " + ps.getCGPA());
 }
}