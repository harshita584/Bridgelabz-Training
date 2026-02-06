package com.studentmanagement;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStream {
	public static void main(String[] args) {
		List<Student> students = List.of(
			    new Student(1, "Student1", 22, "Male",
			            "Computer Engineering", "Bangalore", "Karnataka",
			            15, List.of("900001", "900002")),

			    new Student(2, "Student2", 24, "Female",
			            "Mechanical Engineering", "Mumbai", "Maharashtra",
			            40, List.of("900003")),

			    new Student(3, "Student3", 26, "Male",
			            "Electronics Engineering", "Chennai", "Tamil Nadu",
			            60, List.of("900004", "900005")),

			    new Student(4, "Student4", 28, "Female",
			            "Mechanical Engineering", "Pune", "Maharashtra",
			            10, List.of("900006")),

			    new Student(5, "Student5", 21, "Male",
			            "Civil Engineering", "Delhi", "Delhi",
			            120, List.of("900007")),

			    new Student(6, "Student6", 23, "Female",
			            "Computer Engineering", "Hyderabad", "Telangana",
			            5, List.of("900008", "900009")),

			    new Student(7, "Student7", 27, "Male",
			            "Biotech Engineering", "Bangalore", "Karnataka",
			            75, List.of("900010")),

			    new Student(8, "Student8", 29, "Female",
			            "Electronics Engineering", "Bangalore", "Karnataka",
			            30, List.of("900011", "900012")),

			    new Student(9, "Student9", 25, "Male",
			            "Mechanical Engineering", "Mumbai", "Maharashtra",
			            55, List.of("900013")),

			    new Student(10, "Student10", 31, "Female",
			            "Computer Engineering", "Kolkata", "West Bengal",
			            90, List.of("900014")),

			    new Student(11, "Student11", 20, "Male",
			            "Electronics Engineering", "Bangalore", "Karnataka",
			            8, List.of("900015")),

			    new Student(12, "Student12", 33, "Female",
			            "Mechanical Engineering", "Jaipur", "Rajasthan",
			            150, List.of("900016", "900017"))
			);

		
		// 1. students rank less than 50
		students.stream()
				.filter(s -> s.rank < 50)
				.forEach(System.out::println);
		System.out.println();
		
		// 2. Age greater than 25
		students.stream()
				.filter(s -> s.age > 25)
				.forEach(System.out::println);
		System.out.println();
		
		// 3. Names of students
		students.stream()
				.map(s -> s.name)
				.forEach(System.out::println);
		System.out.println();
		
		// 4. Students from mechanical engineering
		students.stream()
				.filter(s -> s.department.equals("Mechanical Engineering"))
				.forEach(System.out::println);
		System.out.println();
		
		// 5. Student not from Mumbai
		students.stream()
				.filter(s -> !s.city.equals("Mumbai"))
				.forEach(System.out::println);
		System.out.println();
		
		// 1. Sort students by rank (ascending)
		students.stream()
				.sorted((s1, s2) -> s1.rank - s2.rank)
				.forEach(System.out::println);
		System.out.println();

		// 2. Sort students by age (descending)
		students.stream()
				.sorted((s1, s2) -> s2.age - s1.age)
				.forEach(System.out::println);
		System.out.println();

		// 3. Print top 5 students based on rank
		students.stream()
				.sorted((s1, s2) -> s1.rank - s2.rank)
				.limit(5)
				.forEach(System.out::println);
		System.out.println();

		// 4. Print last 3 students based on rank
		students.stream()
				.sorted((s1, s2) -> s2.rank - s1.rank)
				.limit(3)
				.forEach(System.out::println);
		System.out.println();

		// 5. Sort students by name and then rank
		students.stream()
				.sorted((s1, s2) -> {
					if(s1.name.compareTo(s2.name) != 0) return s1.name.compareTo(s2.name);
					return s1.rank - s2.rank;
				})
				.forEach(System.out::println);
		System.out.println();

		
		// 1. Count students in each department
	 	Map<String, Long> mp = students.stream()
				.collect(Collectors.groupingBy(
						s -> s.department,
						Collectors.counting()
				));
	 	System.out.println(mp);

		// 2. Count students in each city
		students.stream()
				.collect(Collectors.groupingBy(
						s -> s.city,
						Collectors.counting()
				))
				.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();

		// 3. Average age of students in each department
		students.stream()
				.collect(Collectors.groupingBy(
						s -> s.department,
						Collectors.averagingInt(s -> s.age)
				))
				.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();

		// 4. Average rank of students by gender
		students.stream()
				.collect(Collectors.groupingBy(
						s -> s.gender,
						Collectors.averagingInt(s -> s.rank)
				))
				.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();

		// 5. Total number of students
		long totalStudents = students.stream().count();
		System.out.println(totalStudents);
		System.out.println();

		// 6. Department with highest average rank
		Map<String, Double> departmentAvgRank = students.stream()
				.collect(Collectors.groupingBy(
						s -> s.department,
						Collectors.averagingInt(s -> s.rank)
				));
		departmentAvgRank.keySet()
				.stream()
				.max((e1, e2) -> Double.compare(departmentAvgRank.get(e2), departmentAvgRank.get(e1)))
				.ifPresent(System.out::println);
		System.out.println();
		
		// 1. Student with lowest rank
		students.stream()
				.max((e1, e2) -> Integer.compare(e1.rank, e2.rank))
				.ifPresent(System.out::println);
		System.out.println();
		
		// 2. Student with highest rank
		students.stream()
				.max((e1, e2) -> Integer.compare(e2.rank, e1.rank))
				.ifPresent(System.out::println);
		System.out.println();		
		
		// 3. second best rank holder
		students.stream()
				.sorted((e1, e2) -> Integer.compare(e1.rank, e2.rank))
				.skip(1)
				.findFirst()
				.ifPresent(System.out::println);
		System.out.println();
		
		// 4. third best rank holder
		students.stream()
				.sorted((e1, e2) -> Integer.compare(e1.rank, e2.rank))
				.skip(2)
				.findFirst()
				.ifPresent(System.out::println);
		System.out.println();
		
		// 5. Youngest student
		students.stream()
				.min((s1, s2) -> Integer.compare(s1.age, s2.age))
				.ifPresent(System.out::println);
		System.out.println();
		
		// 6. Oldest student
		students.stream()
				.max((s1, s2) -> Integer.compare(s1.age, s2.age))
				.ifPresent(System.out::println);
		System.out.println();
		
		// 1. Print all contact number of all students
		students.stream()
				.flatMap(s -> s.contacts.stream())
				.forEach(System.out::println);
		System.out.println();
		
		// 2. Count the total number of contact numbers
		long count = students.stream()
				.flatMap(s -> s.contacts.stream())
				.count();
		System.out.println("Totat contacts : " + count);
		System.out.println();
		
		// 3. Students with more than one contact
		List<Student> studentsWithMoreThanOneContact = students.stream()
															   .filter(s -> s.contacts.size() > 1)
															   .toList();
		System.out.println(studentsWithMoreThanOneContact);
		System.out.println();
		
		// 4. Print all unique numbers
		students.stream()
				.flatMap(s -> s.contacts.stream())
				.distinct()
				.forEach(System.out::println);
		System.out.println();
		
		// 1. Check if any student belongs to Biotech Engineering
		boolean isBiotechPresent = students.stream()
				.anyMatch(s -> s.department.equals("Biotech Engineering"));
		System.out.println("Any student belongs to Biotech Engineering : " + isBiotechPresent);
		System.out.println();
		
		// 2. Check all students above 20
		boolean allAbove20 = students.stream()
		        .allMatch(s -> s.age > 20);
		System.out.println(allAbove20);
		System.out.println();
		
		// 3. Check if no student belongs to Civil Engineering
		boolean allNonCivil = students.stream()
				.noneMatch(s -> s.department.equals("Civil Engineering"));
		System.out.println(allNonCivil);
		System.out.println();
				
		// 1. Count male and female students
		Map<String, Long> genderWiseCount = students.stream()
				.collect(Collectors.groupingBy(
						s -> s.gender, 
						Collectors.counting()
				));
		System.out.println(genderWiseCount);
		System.out.println();
		
		// 2. Average age of male students
		students.stream()
				.filter(s -> s.gender.equals("Male"))
				.mapToDouble(s -> s.age)
				.average()
				.ifPresent(System.out::println);
		System.out.println();
		
		// 3. Average age of female students
		students.stream()
			.filter(s -> s.gender.equals("Female"))
			.mapToDouble(s -> s.age)
			.average()
			.ifPresent(System.out::println);
		System.out.println();
		
		// 4. Highest ranked male student
		students.stream()
				.filter(s -> s.gender.equals("Male"))
				.min((s1, s2) -> s1.age - s2.age)
				.ifPresent(System.out::println);
		System.out.println();
		
		// 5. Highest ranked female student
		students.stream()
			.filter(s -> s.gender.equals("Female"))
			.min((s1, s2) -> s1.age - s2.age)
			.ifPresent(System.out::println);
		System.out.println();
		
		// 1. List students department-wise with names only
		Map<String, List<String>> departmentWiseStudentNames = students.stream()
				.collect(Collectors.groupingBy(
						s -> s.department,
						Collectors.mapping(s -> s.name, Collectors.toList())
				));
		System.out.println(departmentWiseStudentNames);
		System.out.println();
		
		// 2. Youngest in Computer Engineering
		students.stream()
        	.filter(s -> s.department.equals("Computer Engineering"))
        	.min((s1, s2) -> s1.age - s2.age)
        	.ifPresent(System.out::println);
		System.out.println();

		// 3. Top-ranked student in Mechanical Engineering
		students.stream()
        	.filter(s -> s.department.equals("Mechanical Engineering"))
        	.min((s1, s2) -> s1.rank - s2.rank)
        	.ifPresent(System.out::println);
		System.out.println();
		
		// 4. Count students in Electronics Engineering from Karnataka
		long electronicsStudentsFromKarnataka = students.stream()
				.filter(s -> s.state.equals("Karnataka"))
				.count();
		System.out.println("Electronics Engineering from Karnataka : " + electronicsStudentsFromKarnataka);
		System.out.println();

		// 1. Convert the student list into a Map<Id, Name>
		Map<Integer, String> studentIdNameMap =
		        students.stream()
		                .collect(Collectors.toMap(
		                        s -> s.id,
		                        s -> s.name
		                ));
		System.out.println(studentIdNameMap);
		System.out.println();
		
		// 2. Convert the student list into a Map<Department, List<Student>>
		Map<String, List<Student>> departmentWiseStudentList = students.stream()
				.collect(Collectors.groupingBy(
						s -> s.department,
						Collectors.toList()
				));
		System.out.println(departmentWiseStudentList);
		System.out.println();
		
		// 3. Name starts with S
		students.stream()
        	.filter(s -> s.name.startsWith("S"))
        	.forEach(System.out::println);
		System.out.println();
		
		// 4. Name length > 5
		students.stream()
        	.filter(s -> s.name.length() > 5)
        	.forEach(System.out::println);
		System.out.println();

		// 5. Even rank
		students.stream()
        	.filter(s -> s.rank % 2 == 0)
        	.forEach(System.out::println);
		System.out.println();
		
		// 6. Odd rank
		students.stream()
        	.filter(s -> s.rank % 2 != 0)
        	.forEach(System.out::println);
		System.out.println();

		// 1. Find the top 3 youngest students
		students.stream()
		        .sorted((s1, s2) -> s1.age - s2.age)
		        .limit(3)
		        .forEach(System.out::println);
		System.out.println();

		// 2. Find the top 3 oldest students
		students.stream()
		        .sorted((s1, s2) -> s2.age - s1.age)
		        .limit(3)
		        .forEach(System.out::println);
		System.out.println();

		// 3. Partition students based on age > 25
		Map<Boolean, List<Student>> agePartition =
		        students.stream()
		                .collect(Collectors.partitioningBy(s -> s.age > 25));
		System.out.println(agePartition);
		System.out.println();

		// 4. Partition students based on rank < 100
		Map<Boolean, List<Student>> rankPartition =
		        students.stream()
		                .collect(Collectors.partitioningBy(s -> s.rank < 100));

		System.out.println(rankPartition);
		System.out.println();

		// 5. Find the city having maximum students
		students.stream()
		        .collect(Collectors.groupingBy(s -> s.city, Collectors.counting()))
		        .entrySet()
		        .stream()
		        .max(Map.Entry.comparingByValue())
		        .ifPresent(System.out::println);
		System.out.println();

		// 6. Find the department having minimum students
		students.stream()
		        .collect(Collectors.groupingBy(s -> s.department, Collectors.counting()))
		        .entrySet()
		        .stream()
		        .min(Map.Entry.comparingByValue())
		        .ifPresent(System.out::println);
		System.out.println();
	}
}
