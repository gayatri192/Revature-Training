package com.dayTwo;

import java.util.Scanner;

public class Que6AvgProduct {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String msg = scanner.next();

            if (msg.equalsIgnoreCase("q")) {
                break;
            }

            try {
               
                int num = Integer.parseInt(msg);
                sum += num;
                product *= num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
            System.out.println("The product is: " + product);
        } else {
            System.out.println("No Value is entered");
        }

	}
}
