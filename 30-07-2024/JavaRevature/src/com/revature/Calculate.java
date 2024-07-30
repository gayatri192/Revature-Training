package com.revature;

import java.util.Scanner;

public class Calculate {
	
	
	public double add(double a, double b){
		return a + b;
	}
	public double subtract(double a, double b){
		return a - b;
	}
	public double multiply(double a, double b){
		return a * b;
	}
	public double divide(double a, double b){
		return a / b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
	    double number1 = sc.nextDouble();
	    
	    System.out.println("Enter a Number 2:");
	    double number2 = sc.nextDouble();
		
		Calculate cal = new Calculate();
		
		//double number1 = 10;
		//double number2 = 2;
		
		System.out.println("Addition :" + cal.add(number1, number2));
		System.out.println("Subtraction :" + cal.subtract(number1, number2));
		System.out.println("Multiplication :" + cal.multiply(number1, number2));
		System.out.println("Divide :" + cal.divide(number1, number2));

	}

}
