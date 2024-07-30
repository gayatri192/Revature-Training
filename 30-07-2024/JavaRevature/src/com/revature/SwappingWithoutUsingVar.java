package com.revature;

public class SwappingWithoutUsingVar {

	public static void main(String[] args) {
		int x = 6;
		int y = 8;
		
		System.out.println("Before Swapping : x = " +x + ", y = " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping : x = " +x + ", y = " + y);

	}

}
