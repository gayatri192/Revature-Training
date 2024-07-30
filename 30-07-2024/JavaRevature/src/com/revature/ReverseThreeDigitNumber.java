package com.revature;

import java.util.Scanner;

public class ReverseThreeDigitNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Three digit number: ");
		int number = sc.nextInt();
		 if (number < 100 || number > 999) {
	            System.out.println("Please enter a valid three digit number");
	        } else {
	            
	            int reversedNumber = 0;
	            while (number != 0) {
	                int digit = number % 10;
	                reversedNumber = reversedNumber * 10 + digit;
	                number /= 10;
	            }
	            
	            System.out.println("Reversed number: " + reversedNumber);
	        }

	}

}
