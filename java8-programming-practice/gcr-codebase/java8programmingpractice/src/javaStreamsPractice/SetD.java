package javaStreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SetD {

	//1. Character Frequency Count
	static Map<Character, Long> charFrequency()
	{
		String input = "banana";
		Map<Character, Long> freq =
				input.chars()
				     .mapToObj(ch -> (char) ch)
				     .collect(Collectors.groupingBy(
				    		 Function.identity(),
				    		 Collectors.counting()));
		return freq;
	}

	//2. Word Frequency Count
	static Map<String, Long> wordFrequency()
	{
		String input = "java is java and java is fast";
		Map<String, Long> freq =
				Arrays.stream(input.split("\\s+"))
				      .collect(Collectors.groupingBy(
				    		  Function.identity(),
				    		  Collectors.counting()));
		return freq;
	}

	//3. First Non-Repeating Character
	static Character firstNonRepeatingChar()
	{
		String input = "stress";

		Character result =
				input.chars()
				     .mapToObj(c -> (char) c)
				     .collect(Collectors.groupingBy(
				    		 Function.identity(),
				    		 java.util.LinkedHashMap::new,
				    		 Collectors.counting()))
				     .entrySet()
				     .stream()
				     .filter(e -> e.getValue() == 1)
				     .map(Map.Entry::getKey)
				     .findFirst()
				     .orElse(null);

		return result;
	}


	//4. All Non-Repeating Characters
	static List<Character> allNonRepeatingChars()
	{
		String input = "programming";
		List<Character> list =
				input.chars()
				     .mapToObj(c -> (char) c)
				     .collect(Collectors.groupingBy(
				    		 Function.identity(),
				    		 Collectors.counting()))
				     .entrySet()
				     .stream()
				     .filter(e -> e.getValue() == 1)
				     .map(Map.Entry::getKey)
				     .toList();
		return list;
	}

	//5. Remove Duplicate Characters
	static String removeDuplicateChars()
	{
		String input = "banana";
		String result =
				input.chars()
				     .distinct()
				     .mapToObj(c -> String.valueOf((char) c))
				     .collect(Collectors.joining());
		return result;
	}

	//6. Remove Repeating Characters (Keep Only Unique Once)
	static String keepOnlyUnique()
	{
		String input = "aabbccdde";
		String result =
				input.chars()
				     .mapToObj(c -> (char) c)
				     .collect(Collectors.groupingBy(
				    		 Function.identity(),
				    		 Collectors.counting()))
				     .entrySet()
				     .stream()
				     .filter(e -> e.getValue() == 1)
				     .map(e -> String.valueOf(e.getKey()))
				     .collect(Collectors.joining());
		return result;
	}

	//7. Remove Non-Alphanumeric Characters
	static String removeNonAlphanumeric()
	{
		String input = "ja@va#8!!";
		String result =
				input.chars()
				     .filter(Character::isLetterOrDigit)
				     .mapToObj(c -> String.valueOf((char) c))
				     .collect(Collectors.joining());
		return result;
	}

	//8. Keep Only Alphabets
	static String keepOnlyAlphabets()
	{
		String input = "java8stream2025";
		String result =
				input.chars()
				     .filter(Character::isLetter)
				     .mapToObj(c -> String.valueOf((char) c))
				     .collect(Collectors.joining());
		return result;
	}

	//9. Keep Only Digits
	static String keepOnlyDigits()
	{
		String input = "orderId=AB123XZ9";
		String result =
				input.chars()
				     .filter(Character::isDigit)
				     .mapToObj(c -> String.valueOf((char) c))
				     .collect(Collectors.joining());
		return result;
	}

	//10. Count Each Character Except Spaces
	static Map<Character, Long> charCountWithoutSpace()
	{
		String input = "java stream";
		Map<Character, Long> freq =
				input.chars()
				     .filter(ch -> ch != ' ')
				     .mapToObj(ch -> (char) ch)
				     .collect(Collectors.groupingBy(
				    		 Function.identity(),
				    		 Collectors.counting()));
		return freq;
	}

	public static void main(String[] args) {

		System.out.println("Question 1: " + charFrequency());
		System.out.println("Question 2: " + wordFrequency());
		System.out.println("Question 3: " + firstNonRepeatingChar());
		System.out.println("Question 4: " + allNonRepeatingChars());
		System.out.println("Question 5: " + removeDuplicateChars());
		System.out.println("Question 6: " + keepOnlyUnique());
		System.out.println("Question 7: " + removeNonAlphanumeric());
		System.out.println("Question 8: " + keepOnlyAlphabets());
		System.out.println("Question 9: " + keepOnlyDigits());
		System.out.println("Question 10: " + charCountWithoutSpace());
	}
}
