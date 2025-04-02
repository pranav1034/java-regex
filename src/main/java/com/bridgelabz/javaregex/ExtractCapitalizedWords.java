package com.bridgelabz.javaregex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {

    public static void ExtractCapital(String str){
        Pattern pattern = Pattern.compile("[A-Z][A-Za-z]*");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.print(matcher.group()+ ", ");
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ExtractCapital(str);
    }
}
