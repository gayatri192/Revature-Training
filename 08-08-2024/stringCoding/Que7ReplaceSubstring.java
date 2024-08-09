package com.stringCoding;

import java.util.Scanner;

public class Que7ReplaceSubstring {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the original sentence: ");
	        String sentence = scanner.nextLine();

	       
	        System.out.print("Enter the substring to be replaced: ");
	        String oldSubstring = scanner.nextLine();

	       
	        System.out.print("Enter the new substring: ");
	        String newSubstring = scanner.nextLine();

	      
	        String modifiedSentence = sentence.replace(oldSubstring, newSubstring);

	       
	        System.out.println("Modified sentence: " + modifiedSentence);

	        
	    }

}
