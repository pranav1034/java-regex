package com.bridgelabz.javaregex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractDates {
    public static void main(String[] args) {
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        String s = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
