package com.Day2.Arrays;

import java.util.Scanner;

public class Que3ArrayInputNo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[20];

	        int positive = 0;
	        int negative = 0;
	        int odd = 0;
	        int even = 0;
	        int zero = 0;
	        
	        System.out.println("Enter 20 integers:");

	        for (int i = 0; i < 20; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < 20; i++) {
	            if (numbers[i] > 0) {
	                positive++;
	            } else if (numbers[i] < 0) {
	                negative++;
	            } else {
	                zero++;
	            }
	        }

	       
	        for (int i = 0; i < 20; i++) {
	            if (numbers[i] % 2 == 0) {
	                even++;
	            } else {
	                odd++;
	            }
	        }

	   
	        System.out.println("Number of positive numbers: " + positive);
	        System.out.println("Number of negative numbers: " + negative);
	        System.out.println("Number of odd numbers: " + odd);
	        System.out.println("Number of even numbers: " + even);
	        System.out.println("Number of zeros: " + zero);
	    }
	}

	


