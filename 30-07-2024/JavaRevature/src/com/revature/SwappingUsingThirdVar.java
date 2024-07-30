package com.revature;

public class SwappingUsingThirdVar {

	public static void main(String[] args) {
		int x = 6;
		int y = 8;
		
		System.out.println("Before Swapping : x = " +x + ", y = " + y);
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swapping : x = " +x + ", y = " + y);

	}

}
