package com.Day2.Arrays;

import java.util.Scanner;

public class Que5SumAndProductEle {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.println("Enter the size of Array:");
	        int num = scanner.nextInt();
	        
	        int[] array = new int[num];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < num; i++) {
	            array[i] = scanner.nextInt();
	        }
	       
	        int sum = 0;
	        int product = 1;
	        
	        for (int i = 0; i < num; i++) {
	            sum += array[i];
	            product *= array[i];
	        }
	        
	       
	        System.out.println("Sum of all elements: " + sum);
	        System.out.println("Product of all elements: " + product);
	    }

	}


