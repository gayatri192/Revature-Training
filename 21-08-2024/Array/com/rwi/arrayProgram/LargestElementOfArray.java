package com.rwi.arrayProgram;

public class LargestElementOfArray {

	public static void main(String[] args) {
		int arr[] = {23,45,12,66,98,89};
		 int max = arr[0];
		 for(int i=0; i<arr.length;i++){
			 if(max < arr[i]){
				 max =arr[i]; 
			 }
		 }
		 System.out.println("Largest Element of Array is = " +max);

	}

}
