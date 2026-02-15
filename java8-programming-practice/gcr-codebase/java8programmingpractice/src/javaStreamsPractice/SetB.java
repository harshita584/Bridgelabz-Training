package javaStreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SetB {
 
	//11. Remove duplicate elements from list
	static List<Integer> removeduplicates()
	{
		List<Integer> numbers = Arrays.asList(1,1,2,3,4,5,4,3,2,4);
		List<Integer> unique = numbers.stream().distinct().toList();
		return unique;
	}
	
	//12. Sort list in descending order
	static List<Integer> sortedDescending()
	{
		List<Integer> numbers = Arrays.asList(12,9,7,5,3,15);
		List<Integer> sorted = numbers.stream().sorted(Comparator.reverseOrder()).toList();
		return sorted;
	}
	
	//13. Find second highest number
	static int secondHighest()
	{
		List<Integer> numbers = Arrays.asList(12,9,7,5,3,15);
		int secHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		return secHighest;
	}
	
	//14. Join strings with comma
	static String joinStrings()
	{
		List<String> strings = Arrays.asList("Harshita", "Patel");
		String joinedStrings = strings.stream().
				                    collect(Collectors.joining(","));
		return joinedStrings;
	}
	
	//15. Frequency of each character
	static Map<Character, Long> freCharacter()
	{
		String string = "JavaProgramming";
		Map<Character, Long> freq = string.toLowerCase().chars().
				                    mapToObj(c -> (char)c).
				                    collect(Collectors.groupingBy(
				                    		c->c,
				                    		Collectors.counting()));
		return freq;
	}
	
	//16. Find numbers greater than 50
	static List<Integer> numbersGreaterThan50() {
	    List<Integer> numbers = Arrays.asList(10, 55, 60, 23, 90);
	    List<Integer> result = numbers.stream()
	                                  .filter(n -> n > 50)
	                                  .toList();
	    return result;
	}

	//17. Group strings by length
	static Map<Integer, List<String>> groupByLength() {
	    List<String> strings = Arrays.asList("a", "bb", "ccc", "dd");
	    Map<Integer, List<String>> grouped =
	            strings.stream()
	                   .collect(Collectors.groupingBy(String::length));
	    return grouped;
	}

	//18. Find first non-repeated character
	static Character firstNonRepeatedChar() {
	    String input = "stress";

	    Character result = input.chars()
	            .mapToObj(ch -> (char) ch)
	            .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
	            .findFirst()
	            .orElse(null);

	    return result;
	}

	//19. Convert List<Integer> to List<String>
	static List<String> convertIntToString() {
	    List<Integer> numbers = Arrays.asList(1, 2, 3);
	    List<String> result = numbers.stream()
	                                 .map(String::valueOf)
	                                 .toList();
	    return result;
	}

	//20. Count occurrences of each word
	static Map<String, Long> countWordOccurrences() {
	    String input = "java is java and java is fast";

	    Map<String, Long> wordCount =
	            Arrays.stream(input.split("\\s+"))
	                  .collect(Collectors.groupingBy(
	                          word -> word,
	                          Collectors.counting()
	                  ));
	    return wordCount;
	}
	
	public static void main(String[] args) {
		System.out.println("Question 11: ");
    	System.out.println("List of unique elements is: "+removeduplicates());
    	
    	System.out.println("\nQuestion 12: ");
    	System.out.println("List of sorted decreasing elements is: "+sortedDescending());
    	
    	System.out.println("\nQuestion 13: ");
    	System.out.println("Second Highest element is: "+secondHighest());
    	
    	System.out.println("\nQuestion 14: ");
    	System.out.println("Joined String is: "+joinStrings());
    	
    	System.out.println("\nQuestion 15: ");
    	System.out.println("Frequency of character is: "+freCharacter());

        System.out.println("Question 16:");
        System.out.println("Numbers greater than 50: " + numbersGreaterThan50());

        System.out.println("\nQuestion 17:");
        System.out.println("Grouped strings by length: " + groupByLength());

        System.out.println("\nQuestion 18:");
        System.out.println("First non-repeated character: " + firstNonRepeatedChar());

        System.out.println("\nQuestion 19:");
        System.out.println("Converted List<Integer> to List<String>: " + convertIntToString());

        System.out.println("\nQuestion 20:");
        System.out.println("Count of each word: " + countWordOccurrences());
	}
}
