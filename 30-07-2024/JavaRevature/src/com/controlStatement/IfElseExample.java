package com.controlStatement;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,b,c;
		System.out.println("Enter the length:");
		i=sc.nextInt();
		System.out.println("Enter the breadth:");
		b=sc.nextInt();
		
		if(i==b)
		{
			System.out.println("Square");
			
		}
		else{
			System.out.println("Rectangle");
			
		}
	}

}
