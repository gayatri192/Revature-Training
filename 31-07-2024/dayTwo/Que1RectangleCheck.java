package com.dayTwo;

import java.util.Scanner;

public class Que1RectangleCheck {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length,breadth,result;
		System.out.println("Enter the length:");
		length=sc.nextInt();
		System.out.println("Enter the breadth:");
		breadth=sc.nextInt();
		
		if(length == breadth)
		{
			System.out.println("The Rectangle is a square");
			
		}
		else{
			System.out.println("The Rectangle is not a square");
			
		}

	}


}
