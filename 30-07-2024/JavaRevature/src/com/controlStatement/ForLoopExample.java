package com.controlStatement;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fact=1;
		
		System.out.println("Enter the Positive Number = ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++){
			fact*=i;
		}
		System.out.println("Factorial :"+fact);

	}

}
