package com.dayTwo;

public class Que5NumberPattern {
	
	public static void main(String[] args) {
		
	int row = 4; 

    
    for (int i = 0; i < row; i++) {
        
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        
        for (int k = row - i; k > 0; k--) {
            System.out.print((k % 2 == 0) ? "0" : "1");
        }
        System.out.println();
      }
}
}
