package com.revature;

import java.util.Scanner;

public class SumOfThreeDigit {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter a Three digit number: ");
	     int number = scanner.nextInt();
	     if (number < 100 || number > 999) {
	    	 System.out.println("Please enter a valid Three digit number");
	        } else {
	        	int sum = 0;
	            while (number != 0) {
	                sum += number % 10;  
	                number /= 10;        
	            }
	            
	            System.out.println("Sum of the digits: " + sum);
	        }

	}

}
