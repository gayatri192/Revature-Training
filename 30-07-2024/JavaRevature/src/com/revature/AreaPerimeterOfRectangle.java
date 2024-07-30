package com.revature;

import java.util.Scanner;

public class AreaPerimeterOfRectangle {
	
	public static double calArea(double length, double width){
		return length * width;
	}
	public static double calPerimeter(double length, double width){
		return 2 * (length * width);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle :");
		double length = sc.nextDouble();
		
		System.out.println("Enter the width of rectangle :");
		double width = sc.nextDouble();
		
		double area = calArea(length, width);
		double perimeter = calPerimeter(length, width);
		
		System.out.println("The Area of Rectangle is :" +area);
		System.out.println("The Perimeter of Rectangle:" +perimeter);

	}

}
