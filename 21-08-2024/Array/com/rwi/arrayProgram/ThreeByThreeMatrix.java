package com.rwi.arrayProgram;

public class ThreeByThreeMatrix {

	public static void main(String[] args) {
		int arr[][] = {{2 , 1, 4}, {5, 7, 9}, {2, 6, 9}};
		  for(int i= 0; i<arr.length; i++){
			  for(int j= 0; j<arr[0].length; j++){
				  System.out.print(arr[i][j] +" ");
			  }
			  System.out.println();
		  }
	}

}
