package com.datastructure.queue;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryUsingStack {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Binary equivalent: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        while (decimal != 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }
        StringBuilder binary = new StringBuilder();
        while (!stack.empty()) {
            binary.append(stack.pop());
        }
        return binary.toString();

	}

}
