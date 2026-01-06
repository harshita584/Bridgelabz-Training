package com.linkedlist.singlylinkedlist;
import java.util.Scanner;

class StudentNode{
	int rollNo;
	String name;
	int age;
	char grade;
	StudentNode next;
	
	StudentNode(int rollNo, String name, int age, char grade)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}

class StudentLinkedList{
	
private StudentNode head;
	
	// 1. Add at Beginning
	public void addAtBeginning(int rollNo, String name, int age, char grade)
	{
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		newNode.next = head;
		head = newNode;
	}
	
	// 2. Add at End
	public void addAtEnd(int rollNo, String name, int age, char grade)
	{
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		StudentNode temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next=newNode;
	}
	
	// 3. Add at specific position
	public void addAtSpecificPosition(int position, int rollNo, String name, int age, char grade)
	{
		if(position <= 0)
		{
			System.out.println("Invalid Position!");
			return;
		}
		
	    if(position == 1)
	    {
	    	addAtBeginning(rollNo, name, age, grade);
	    	return;
	    }
	    
	    StudentNode newNode = new StudentNode(rollNo, name, age, grade);
	    StudentNode temp = head;
	    
	    for(int i=1; i<position-1 && temp!=null; i++)
	    {
	    	temp = temp.next;
	    }
		
	    if(temp == null)
	    {
	    	System.out.println("Position out of range.");
	    	return;
	    }
	    
	    newNode.next = temp.next;
	    temp.next = newNode;
	}
	
	// 4. Delete by Roll Number
	public void deleteByRollNo(int rollNo)
	{
		if(head == null)
		{
			System.out.println("List is Empty!");
			return;
		}
		
		if(head.rollNo == rollNo)
		{
			head = head.next;
			return;
		}
		
		StudentNode temp = head;
		while(temp.next!=null && temp.next.rollNo!=rollNo)
		{
			temp = temp.next;
		}
		
		if(temp.next == null)
		{
			System.out.println("Record not found!");
			return;
		}
		
		temp.next = temp.next.next;
		System.out.println("Student Record Deleted!");
	}
	
	// 5. search by roll number
	public void searchByRollNo(int rollNo)
	{
		StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
	}
	
	// 6. update grade
	public void updateGrade(int rollNo, char grade)
	{
		StudentNode temp = head;
		while(temp != null)
		{
			if(temp.rollNo == rollNo)
			{
				temp.grade = grade;
				System.out.println("Grade Updated.");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Record not found.");
	}
	
	// 7. Display all records
	 public void displayAll() {
	        if (head == null) {
	            System.out.println("No student records available.");
	            return;
	        }

	        StudentNode temp = head;
	        while (temp != null) {
	            System.out.println("Roll No: " + temp.rollNo);
	            System.out.println("Name: " + temp.name);
	            System.out.println("Age: " + temp.age);
	            System.out.println("Grade: " + temp.grade);
	            temp = temp.next;
	        }
	 }
}

public class StudentRecordManagement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();
            
            while (true) {
                System.out.println("\n--- Student Record Management ---");
                System.out.println("1. Add at Beginning");
                System.out.println("2. Add at End");
                System.out.println("3. Add at Position");
                System.out.println("4. Delete by Roll No");
                System.out.println("5. Search by Roll No");
                System.out.println("6. Update Grade");
                System.out.println("7. Display All");
                System.out.println("8. Exit");

                System.out.print("Enter choice: ");
                int choice1 = sc.nextInt();

                switch (choice1) {

                    case 1: {
                        System.out.print("Enter Roll No: ");
                        int roll = sc.nextInt();
                        sc.nextLine(); 
                        
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Grade: ");
                        char grade = sc.next().charAt(0);

                        list.addAtBeginning(roll, name, age, grade);
                        break;
                    }

                    case 2: {
                        System.out.print("Enter Roll No: ");
                        int roll = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Grade: ");
                        char grade = sc.next().charAt(0);

                        list.addAtEnd(roll, name, age, grade);
                        break;
                    }

                    case 3: {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();

                        System.out.print("Enter Roll No: ");
                        int roll = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Grade: ");
                        char grade = sc.next().charAt(0);

                        list.addAtSpecificPosition(pos, roll, name, age, grade);
                        break;
                    }

                    case 4: {
                        System.out.print("Enter Roll No to delete: ");
                        int roll = sc.nextInt();

                        list.deleteByRollNo(roll);
                        break;
                    }

                    case 5: {
                        System.out.print("Enter Roll No to search: ");
                        int roll = sc.nextInt();

                        list.searchByRollNo(roll);
                        break;
                    }

                    case 6: {
                        System.out.print("Enter Roll No: ");
                        int roll = sc.nextInt();

                        System.out.print("Enter New Grade: ");
                        char grade = sc.next().charAt(0);

                        list.updateGrade(roll, grade);
                        break;
                    }

                    case 7:
                        list.displayAll();
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        
	}

}
