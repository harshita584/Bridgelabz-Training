package com.regex;


public class ValidateIP {
	public static void main(String[] args) {
		String ip = "255.255.255.255";
        String octetRegex = "25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2}";

        String[] parts = ip.split("\\.");

        boolean isValid = true;

        if (parts.length != 4) isValid = false;
        else {
            for (String part : parts) {
                if (!part.matches(octetRegex)) {
                    isValid = false;
                    break;
                }
            }
        }
        System.out.println(isValid);
	}
}
