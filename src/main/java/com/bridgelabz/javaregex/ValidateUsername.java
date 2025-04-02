package com.bridgelabz.javaregex;
import java.util.*;
import java.util.regex.*;

public class ValidateUsername {
    private static final Pattern userName =  Pattern.compile("^[a-zA-z][a-zA-z0-9]{4,14}");

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        if(isValidate(str)){
            System.out.println("Valid Username");
        }
        else {
            System.out.println("Invalid Username");
        }
    }
    public static boolean isValidate(String s){
        Matcher matcher = userName.matcher(s);
        return matcher.matches();
    }
}
