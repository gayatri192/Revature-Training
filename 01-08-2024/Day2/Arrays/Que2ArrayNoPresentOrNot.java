package com.Day2.Arrays;

import java.util.Scanner;

public class Que2ArrayNoPresentOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int [10];
		
		System.out.println("Enter 10 Integer :");
		
		for(int i = 0; i < 10; i++){
			num[i] = sc.nextInt();
		}
		
		 System.out.print("Enter a number to check if it is in the array: ");
	        int numberToCheck = sc.nextInt();

	        boolean isPresent = false;
	        int i = 0;
	        while (i < num.length) {
	            if (num[i] == numberToCheck) {
	                isPresent = true;
	                break;
	            }
	            i++;
	        }

	        if (isPresent) {
	            System.out.println("The number is present in the array");
	        } else {
	            System.out.println("The number is not present in the array");
	        }

	}

}
