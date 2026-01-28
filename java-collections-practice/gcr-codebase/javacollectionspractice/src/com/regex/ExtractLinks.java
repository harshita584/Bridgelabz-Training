package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
	public static void main(String[] args) {
		String text = "Visit https://google.com and http://example.org for info";

		Pattern pattern = Pattern.compile("https?://[A-Za-z0-9.-]+");
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
		    System.out.println(matcher.group());
		}
	}
}
