package com.rwi.sortingArray;

import java.util.Arrays;

public class SortedArray {

	static void printOrder(int []arr,int n){
   	 Arrays.sort(arr);
   	 for(int i=0;i<n;i++){
   		 System.out.print(arr[i] +" ");
   	 }
   	
   }
    public static void main(String[] args){
   	 int arr[] = {23,45,12,66,78,89};
		 int n = arr.length;
		 printOrder(arr,n);

}
}
