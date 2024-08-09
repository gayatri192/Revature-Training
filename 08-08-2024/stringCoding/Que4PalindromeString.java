package com.stringCoding;

import java.util.Scanner;

public class Que4PalindromeString {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Reverse the string
        String reversedString = new StringBuilder(str).reverse().toString();

        // Check if the original and reversed strings are equal
        return str.equalsIgnoreCase(reversedString);
    }

}
