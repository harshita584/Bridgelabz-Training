package com.universitydigitalrecordsystem;

import java.util.ArrayList;

public class DigitalRecordSystem {	
	public static Student insert(Student root, Student student) {
	    if (root == null) return student;

	    if (student.rollno < root.rollno) root.left = insert(root.left, student);
	    else root.right = insert(root.right, student);

	    return root;
	}

	
	public static void getList(Student root, ArrayList<Student> students){
		if(root == null) return;
		
		getList(root.left, students);
		students.add(root);
		getList(root.right, students);
	}
	
	public static Student delete(Student root, int rollno) {
		if(root == null) return null;
		
		if(root.rollno < rollno) root.right  = delete(root.right, rollno);
		else if(root.rollno > rollno) root.left = delete(root.left, rollno);
		else {
			if(root.left == null && root.right == null) return null;
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;
			else {
				Student student = getMin(root.right);
				root.rollno = student.rollno;
				root.details = student.details;
				root.right = delete(root.right, student.rollno);
				return root;
			}
		}
		return root;
	}
	
	private static Student getMin(Student student) {
		if(student.left == null) return student;
		return getMin(student.left);
	}
	
	public static void main(String[] args) {
		Student root = new Student(50, "Amit CSE Bhopal");

        Student s30 = new Student(30, "Rohit ECE Indore");
        Student s70 = new Student(70, "Neha IT Pune");

        Student s20 = new Student(20, "Anil ME Delhi");
        Student s40 = new Student(40, "Pooja CSE Jaipur");

        Student s60 = new Student(60, "Kiran EE Nagpur");
        Student s80 = new Student(80, "Sneha AI Mumbai");

        root.left = s30;
        root.right = s70;

        s30.left = s20;
        s30.right = s40;

        s70.left = s60;
        s70.right = s80;
        
        ArrayList<Student> students = new ArrayList<Student>();
        getList(root, students);
        System.out.println(students);
        
        students.clear();
        root = delete(root, 30);
        getList(root, students);
        System.out.println(students);
	}
}
