package com.bridgelabz.javaregex;
import java.util.*;
import java.util.regex.*;

public class ExtractEmail {

    public static void Extract(String str){
        Pattern pattern = Pattern.compile("[A-Za-z]+@[a-zA-Z]+.[a-z]{2,}");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Extract(str);
    }
}
