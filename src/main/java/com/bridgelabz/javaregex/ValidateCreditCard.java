package com.bridgelabz.javaregex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    private static final Pattern visaPattern = Pattern.compile("^4\\d{15}$");
    private static final Pattern mastercardPattern = Pattern.compile("^5\\d{15}$");

    public static boolean isValidVisa(String cardNumber) {
        Matcher matcher = visaPattern.matcher(cardNumber);
        return matcher.matches();
    }

    public static boolean isValidMasterCard(String cardNumber) {
        Matcher matcher = mastercardPattern.matcher(cardNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String visaCard = "4123456789012345";
        String masterCard = "5123456789012345";
        String random = "6123456789012345"; // Invalid (not Visa or MasterCard)

        System.out.println("Visa valid? " + isValidVisa(visaCard));
        System.out.println("MasterCard valid? " + isValidMasterCard(masterCard));
        System.out.println("Random card valid for Visa? " + isValidVisa(random));
        System.out.println("Random card valid for Mastercard? " + isValidMasterCard(random));
    }
}

