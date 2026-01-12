package com.skillforge;

public class Instructor extends User implements ICertifiable {

	public Instructor(String name, int age, String email) {
		super(name, age, email);
		
	}
	
	public String calculateGrade(Student s, Course c) {
		if (s.hasCourse(c)) {
			int marks=s.getMarks(c.title);
			if (marks >= 90) {s.setGrade("A");System.out.println("D"); return "A";}
	        else if (marks >= 75){s.setGrade("B"); System.out.println("D");return "B";}
	        else if (marks >= 60) {s.setGrade("C"); System.out.println("D");return "C";}
	        else {s.setGrade("D"); System.out.println("D");return "D";}
			
		}else {
			return "There is no subject as given ";
		}
	}
	public void giveMarks(Student student,String courseName,int marks) {
		student.marksMap.put(courseName, marks);
	}
	

	@Override
	public String generateCertificate(Student student,Course c) {
		
		if (student.hasCourse(c)) {
            return "----- CERTIFICATE -----\n" +
                    "This is to certify that " + student.getName() + "\n" +
                    "has successfully completed the course: " + c.getTitle() + "\n" +
                    "With grade : "+student.getGrade()+"\n"+
                    "-----------------------";
		}

         
     
            return "Student is not enrolled in the course: " + c.getTitle();
        
	}
  
}
