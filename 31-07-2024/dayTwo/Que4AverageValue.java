package com.dayTwo;

import java.util.Scanner;

public class Que4AverageValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumvalue = 0;
        System.out.print("Enter the 10 Integers :");
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sumvalue += number;
        }
        
        double averageValue = (double) sumvalue / 10;

        System.out.println("The average value is: " + averageValue);


	}

}
