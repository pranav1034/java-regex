package com.bridgelabz.javaregex;
import java.util.regex.*;
import java.util.Scanner;

public class ValidateHexColor {
    private static final Pattern hexColor = Pattern.compile("^#[0-9A-Fa-f]{6}$");

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        if(isValidate(str)){
            System.out.println("Valid Hex Color.");
        }
        else {
            System.out.println("Invalid Hex Color.");
        }
        sc.close();
    }
    public static boolean isValidate(String s){
        Matcher matcher = hexColor.matcher(s);
        return matcher.matches();
    }
}
