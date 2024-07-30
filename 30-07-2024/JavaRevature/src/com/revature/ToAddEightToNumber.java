package com.revature;

public class ToAddEightToNumber {

	public static void main(String[] args) {
		
		int number = 2345;
		int sum = number + 8;
		int quotient = sum / 3;
		int modulus = quotient % 5;
		int result = modulus * 5;
		
		System.out.println("The Final result is :" + result);

	}

}
