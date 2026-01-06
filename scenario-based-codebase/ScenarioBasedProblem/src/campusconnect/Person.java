package campusconnect;

public abstract class Person {

	protected String name;
	protected String email;
	protected int id;
	
	 public void printDetails() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	    }
	
	 public Person(String name, String email, int id) {
		 this.name = name;
		 this.email = email;
		 this.id = id;
	 }
	
}
