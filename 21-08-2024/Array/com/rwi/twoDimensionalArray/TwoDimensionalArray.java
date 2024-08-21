package com.rwi.twoDimensionalArray;

public class TwoDimensionalArray {

	 
    private static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

 
    public static void main(String[] args) {
        
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("The 2D array is:");
        print2DArray(arr);
        
        arr[1][2] = 10;
        System.out.println("\nThe modified 2D array is:");
        print2DArray(arr);
    }
}
