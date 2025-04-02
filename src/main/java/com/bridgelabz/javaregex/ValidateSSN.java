package com.bridgelabz.javaregex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] args) {

        String s = "My SSN is 123-42-6789.";

        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            System.out.println(matcher.group() + " is a Valid SSN");
        } else {
            System.out.println(s + " is an Invalid SSN");
        }
    }
}
