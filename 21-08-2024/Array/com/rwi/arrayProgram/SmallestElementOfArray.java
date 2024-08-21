package com.rwi.arrayProgram;

public class SmallestElementOfArray {

	public static void main(String[] args) {
		int arr[] = {23,45,12,66,98,89};
		 int min = arr[0];
		 for(int i=0; i<arr.length;i++){
			 if(min > arr[i]){
				 min =arr[i]; 
			 }
		 }
		 System.out.print("Smallest Element of Array is = "+min);

	}

}
