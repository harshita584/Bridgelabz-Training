package campusconnect;

public class Faculty extends Person{
	private String department;

	public void printDetails() {
		super.printDetails();
		System.out.println("Department is "+department);
	}
	public void assignCourse() {
		
		System.out.println("course assign successfully.");
	}
	Faculty(String name, String email, int id , String department ){
		super(name , email , id);
		this.department = department;
	}
}
