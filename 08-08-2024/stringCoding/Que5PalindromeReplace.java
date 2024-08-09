package com.stringCoding;

import java.util.Scanner;

public class Que5PalindromeReplace {

	public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        StringBuilder modifiedString = new StringBuilder(input);

       
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j <= input.length(); j++) { 
                String substring = input.substring(i, j);

              
                if (isPalindrome(substring)) {
                    for (int k = i; k < j; k++) {
                        modifiedString.setCharAt(k, '*');
                    }
                }
            }
        }

       
        System.out.println("Modified string: " + modifiedString.toString());

}
}