package javaStreamsPractice;

import java.util.*;
import java.util.stream.Collectors;

public class SetC {

    //21. Partition numbers into even and odd
    static Map<String, List<Integer>> partitionEvenOdd() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<String, List<Integer>> result = new HashMap<>();
        result.put("even", numbers.stream().filter(n -> n % 2 == 0).toList());
        result.put("odd", numbers.stream().filter(n -> n % 2 != 0).toList());

        return result;
    }

    //22. Find duplicate elements only
    static List<Integer> findDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates =
                numbers.stream()
                       .filter(n -> !seen.add(n))
                       .distinct()
                       .toList();

        return duplicates;
    }

    
    //23. Find longest string
    static String longestString() {
        List<String> strings = Arrays.asList("java", "microservices", "api");

        String longest =
                strings.stream()
                       .max(Comparator.comparingInt(String::length))
                       .orElse(null);

        return longest;
    }

    //24. Find top 3 highest numbers
    static List<Integer> topThreeNumbers() {
        List<Integer> numbers = Arrays.asList(10, 90, 30, 70, 50);

        List<Integer> result =
                numbers.stream()
                       .sorted(Comparator.reverseOrder())
                       .limit(3)
                       .toList();

        return result;
    }

    //25. Flatten list of lists
    static List<Integer> flattenList() {
        List<List<Integer>> lists =
                Arrays.asList(Arrays.asList(1, 2),
                              Arrays.asList(3, 4),
                              Arrays.asList(5));

        List<Integer> result =
                lists.stream()
                     .flatMap(List::stream)
                     .toList();

        return result;
    }

    //26. Find sum of squares of even numbers
    static int sumOfSquaresEven() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum =
                numbers.stream()
                       .filter(n -> n % 2 == 0)
                       .map(n -> n * n)
                       .mapToInt(Integer::intValue)
                       .sum();

        return sum;
    }

    //27. Sort map by value
    static Map<String, Integer> sortMapByValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 1);
        map.put("C", 2);

        Map<String, Integer> sortedMap =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByValue())
                   .collect(Collectors.toMap(
                           Map.Entry::getKey,
                           Map.Entry::getValue,
                           (e1, e2) -> e1,
                           LinkedHashMap::new
                   ));

        return sortedMap;
    }

    //28. Find employee with highest salary
    static Employee highestSalaryEmployee() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Harshita", 50000),
                new Employee(2, "Amit", 70000),
                new Employee(3, "Neha", 60000)
        );

        Employee emp =
                employees.stream()
                         .max(Comparator.comparingDouble(Employee::getSalary))
                         .orElse(null);

        return emp;
    }

    //29. Find common elements between two lists
    static List<Integer> commonElements() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        List<Integer> result =
                list1.stream()
                     .filter(list2::contains)
                     .toList();

        return result;
    }

    //30. Find kth smallest element
    static Integer kthSmallest() {
        List<Integer> numbers = Arrays.asList(9, 1, 5, 3, 7);
        int k = 2;

        Integer result =
                numbers.stream()
                       .sorted()
                       .skip(k - 1)
                       .findFirst()
                       .orElse(null);

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Question 21:");
        System.out.println(partitionEvenOdd());

        System.out.println("\nQuestion 22:");
        System.out.println("Duplicate elements: " + findDuplicates());

        System.out.println("\nQuestion 23:");
        System.out.println("Longest string: " + longestString());

        System.out.println("\nQuestion 24:");
        System.out.println("Top 3 highest numbers: " + topThreeNumbers());

        System.out.println("\nQuestion 25:");
        System.out.println("Flattened list: " + flattenList());

        System.out.println("\nQuestion 26:");
        System.out.println("Sum of squares of even numbers: " + sumOfSquaresEven());

        System.out.println("\nQuestion 27:");
        System.out.println("Sorted map by value: " + sortMapByValue());

        System.out.println("\nQuestion 28:");
        System.out.println("Employee with highest salary: " + highestSalaryEmployee());

        System.out.println("\nQuestion 29:");
        System.out.println("Common elements: " + commonElements());

        System.out.println("\nQuestion 30:");
        System.out.println("Kth smallest element: " + kthSmallest());
    }
}

//Employee class for Question 28
class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}
