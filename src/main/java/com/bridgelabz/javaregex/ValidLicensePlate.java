package com.bridgelabz.javaregex;
import java.util.*;
import java.util.regex.*;

public class ValidLicensePlate {
    private static final Pattern licensePlate = Pattern.compile("^[A-Z]{2}[0-9]{4}$");
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        if(isValidate(str)){
            System.out.println("Valid License Plate");
        }
        else {
            System.out.println("Invalid License Plate");
        }
    }
    public static boolean isValidate(String s){
        Matcher matcher = licensePlate.matcher(s);
        return matcher.matches();
    }
}
