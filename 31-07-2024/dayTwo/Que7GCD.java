package com.dayTwo;

import java.util.Scanner;

public class Que7GCD {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second Number :");
		int num2 = sc.nextInt();
		
		while(num1!=num2)   
		{  
		if(num1>num2)  
		num1=num1-num2;  
		else  
		num2=num2-num1;  
		}
		System.out.printf("GCD of num1 and num2 is: " +num2);  

	}

}
