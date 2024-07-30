package com.revature;

import java.util.Scanner;

public class RobertThreeSuject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks for the first subject :");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter the marks for the second subject :");
		int sub2 = sc.nextInt();
		
		System.out.println("Enter the marks for the third subject :");
		int sub3 = sc.nextInt();
		
		int totalMarks = sub1 + sub2 + sub3;
		double percentage = (totalMarks / 300.0) * 100;
		
		System.out.println("Total Marks :" +totalMarks);
		System.out.println("Percentage : " +percentage + "%");

	}

}
