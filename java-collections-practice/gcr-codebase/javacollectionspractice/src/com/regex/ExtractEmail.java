package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
	public static void main(String[] args) {
		String str = "Contact us at support@example.com and info@company.org";
		Pattern pattern = Pattern.compile("[a-zA-Z0-9_.%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
