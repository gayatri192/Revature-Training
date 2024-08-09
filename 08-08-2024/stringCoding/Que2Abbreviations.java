package com.stringCoding;

import java.util.Scanner;

public class Que2Abbreviations {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter your full name: ");
	        String fullName = scanner.nextLine();

	       
	        String[] nameParts = fullName.split(" ");

	       
	        StringBuilder abbreviation = new StringBuilder();

	        
	        for (int i = 0; i < nameParts.length - 1; i++) {
	            abbreviation.append(nameParts[i].charAt(0)).append('.');
	        }

	       
	        abbreviation.append(nameParts[nameParts.length - 1]);

	       
	        System.out.println("Abbreviated name: " + abbreviation.toString());
	        
	       
	    }

}
