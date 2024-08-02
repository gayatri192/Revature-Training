package com.Day2.Arrays;

import java.util.Scanner;

public class Que1Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int [10];
		
		System.out.println("Enter 10 Integer :");
		
		for(int i = 0; i < 10; i++){
			num[i] = sc.nextInt();
		}
		
		System.out.println("You entered the number");
		
		for(int i = 0; i < 10; i++){
			System.out.println(num[i] + "");
		}
		

	}

}
