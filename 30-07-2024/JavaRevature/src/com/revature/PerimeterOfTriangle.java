package com.revature;

import java.util.Scanner;

public class PerimeterOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the first side :");
		double side1 = sc.nextDouble();
		
		System.out.println("Enter the length of the second side :");
		double side2 = sc.nextDouble();
		
		System.out.println("Enter the length of the third side :");
		double side3 = sc.nextDouble();
		
		double perimeter = calPerimeter(side1, side2, side3);
		System.out.println("The perimeter of triangle is :" +perimeter);
		

	}

	public static double calPerimeter(double a, double b, double c) {
		
		return a + b + c;
	}

}
