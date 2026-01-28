package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
	public static void main(String[] args) {
		String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        Pattern pattern = Pattern.compile("\\b[0-9]{2}/[0-9]{2}/[0-9]{4}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
	}
}
