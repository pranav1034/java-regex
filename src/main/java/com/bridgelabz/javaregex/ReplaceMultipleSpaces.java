package com.bridgelabz.javaregex;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String input = "This  is     an   example   with  multiple   spaces.";

        String regex = "\\s+";

        String newText = input.replaceAll(regex, " ");

        System.out.println(newText);

    }
}
