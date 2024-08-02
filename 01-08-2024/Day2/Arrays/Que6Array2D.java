package com.Day2.Arrays;

public class Que6Array2D {
	
	public static void main(String[] args) {
		
		int rows = 2; 
		int cols = 2; 
	    int[][] array = new int[rows][cols];
	     
	    int value = 1; 
	    for (int i = 0; i < rows; i++) {
	         for (int j = 0; j < cols; j++) {
	             array[i][j] = value; 
	             value++; 
	         }
	     }

	     System.out.println("Elements of the 2D array:");
	     for (int i = 0; i < rows; i++) {
	         for (int j = 0; j < cols; j++) {
	             System.out.print(array[i][j] + "\t"); 
	         }
	         System.out.println(); 
	     }
	}
     

}
