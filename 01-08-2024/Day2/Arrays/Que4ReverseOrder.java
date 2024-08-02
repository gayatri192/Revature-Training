package com.Day2.Arrays;

import java.util.Scanner;

public class Que4ReverseOrder {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] newArray = new int[10];
		int[] reverseArray = new int[10];
		
		System.out.println("Enter 10 Integers:");
		for(int i = 0; i< 10; i++){
			newArray[i] = sc.nextInt();
		}
		for(int i = 0; i< 10; i++){
			reverseArray[i] = newArray[9 - i];
		}
		System.out.println("Array in Reverse Order:");
		for(int i = 0; i< 10; i++){
			System.out.print(reverseArray[i]+ " ");
		}
	}

}
