package skillforge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkillForgeApp {
public static void main(String[] args) {
	 Student s1=new Student("Harshita Patel", 21, "harshitapatel@gmail.com", 3.5);
	 Instructor i1=new Instructor("R.P Gupta", 99, "ravigupta@gmail.com");
	 List<String> moduleList=new ArrayList<>(Arrays.asList("Introduction to core java", "Introduction to front-ent technologies ", "Introduction to servlets"));
	 Course c1=new Course("Java Full Stack ",i1,3.6,moduleList);
	 Course c2=new Course("Java language", i1, 3.0);
	 
	 
	 System.out.println("Instructor Name :"+i1.getName());
	 System.out.println("Student Name :" +s1.getName());
	 
	 System.out.println("Is student "+s1.getName()+" is eligible for "+c1.getTitle() +" :"+s1.isEligible(c1));
	 s1.enrollCourse(c2);
	 i1.giveMarks(s1, "Java language", 90);
	 i1.calculateGrade(s1, c2);

	 System.out.println(i1.generateCertificate(s1, c2));
	 
	 
	 
}
 
 

}
