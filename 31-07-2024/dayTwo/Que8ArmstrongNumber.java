package com.dayTwo;

public class Que8ArmstrongNumber {
	
	public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500 are:");

       
        for (int n = 100; n < 500; n++) {
            int originalNum = n;
            int sum = 0;
            int temp = originalNum;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == originalNum) {
                System.out.println(originalNum);
            }
        }
    }

}
