package com.bridgelabz.javaregex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractLinks {
    public static void main(String[] args) {
        String regex = "\\b(?:https?://|www\\.)[a-zA-Z0-9.-]+(?:\\.[a-zA-Z]{2,})+(?:/[^\\s]*)?\\b";
        String s = "\"Visit https://www.google.com and http://example.org for more info.\"";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

