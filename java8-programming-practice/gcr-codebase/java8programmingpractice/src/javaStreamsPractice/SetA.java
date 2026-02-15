package javaStreamsPractice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SetA {
	
	//1. Count vowels in a string using Stream
	static long countVowels()
	{
		String string = new String("Java Programming");
		long vowels = string.toLowerCase().
				     chars().
				     filter(ch -> "aeiou".indexOf(ch)!=-1).
				     count();
		return vowels;
	}
	
	//2. Count number of words in a sentence
	static long countWords()
	{
		String string = "My name is Harshita Patel";
		long words = Arrays.stream(string.trim().split("\\s+")).count();
		return words;
	}
	
	//3. Find even numbers from list
	static List<Integer> evenNumbers()
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> evenNums = numbers.stream().
				                 filter(n -> n%2==0).toList();
		return evenNums;
	}
	
	//4. Find string length list
	static List<Integer> stringLength()
	{
		List<String> strings = Arrays.asList("Apple", "Mango", "Kiwi", "WaterMelon", "Banana");
		List<Integer> lengths = strings.stream().
				                map(String::length).toList();
		return lengths;
	}
	
	//5. Convert list of strings to uppercase
	static List<String> stringUpper()
	{
		List<String> strings = Arrays.asList("java", "python", "c", "kotlin", "javascript");
		List<String> upperStrings = strings.stream().
				                   map(String::toLowerCase).toList();
		return upperStrings;
	}
	
	//6. Count strings starting with ‘a’
	static List<String> startsWithA()
	{
		List<String> strings = Arrays.asList("Apple", "Mango", "Kiwi", "WaterMelon", "Banana", "apricot");
		List<String> str = strings.stream().
				         filter(ch -> ch.startsWith("a")).toList();
		return str;
	}
	
	//7. Remove empty strings
	static List<String> removeEStrings()
	{
		List<String> strings = Arrays.asList("java", "python", "", "kotlin", "");
		List<String> str = strings.stream().
				          filter(ch -> !ch.isEmpty()).toList();
		return str;
	}
	
	//8. Sum of all numbers using stream
	static int sumNumbers()
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int sums = numbers.stream().
				mapToInt(Integer::intValue).
				sum();
		return sums;
	}
	
	//9. Find max number
	static int maxNumbers()
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int max = numbers.stream().
				max(Integer::compareTo).orElse(null);
		return max;
	}
	
	//10. Reverse each string in list
	static List<String> reversed()
	{
		List<String> strings = Arrays.asList("java", "api");
		List<String> str = strings.stream().
				        map(ch -> new StringBuilder(ch).reverse().toString()).toList();
		return str;
	}
	
	public static void main(String[] args) {
	        	System.out.println("Question 1: ");
	        	System.out.println("Count of vowels is: "+countVowels());
	        	
	        	System.out.println("\nQuestion 2: ");
	        	System.out.println("Count of words is: "+countWords());
	        	
	        	System.out.println("\nQuestion 3: ");
	        	System.out.println("List of Even Numbers is: "+evenNumbers());
	        	
	        	System.out.println("\nQuestion 4: ");
	        	System.out.println("List of String Length is: "+stringLength());
	        	
	        	System.out.println("\nQuestion 5: ");
	        	System.out.println("List of UpperCase String is: "+stringUpper());
	        	
	        	System.out.println("\nQuestion 6: ");
	        	System.out.println("List of Words starts with a is: "+startsWithA());
	        	
	        	System.out.println("\nQuestion 7: ");
	        	System.out.println("List after removing empty string: "+removeEStrings());
	        	
	        	System.out.println("\nQuestion 8: ");
	        	System.out.println("Sum of all list is: "+sumNumbers());
	        	
	        	System.out.println("\nQuestion 9: ");
	        	System.out.println("Maximum number from list is: "+maxNumbers());
	        	
	        	System.out.println("\nQuestion 10: ");
	        	System.out.println("List of reversed string is: "+reversed());
	}
	
	
}
