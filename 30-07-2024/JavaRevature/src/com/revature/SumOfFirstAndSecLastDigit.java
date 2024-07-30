package com.revature;

import java.util.Scanner;

public class SumOfFirstAndSecLastDigit {

	public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();
        
        if (number < 10000 || number > 99999) {
            System.out.println("The number entered is not a 5-digit number.");
        } else {
           
            int firstDigit = number / 10000;
           
            int secondLastDigit = (number / 10) % 10;
            
            int sum = firstDigit + secondLastDigit;
            
            // Display the result
            System.out.printf("Sum of the first digit (%d) and second last digit (%d) is %d.%n", firstDigit, secondLastDigit, sum);
        }

}
}
