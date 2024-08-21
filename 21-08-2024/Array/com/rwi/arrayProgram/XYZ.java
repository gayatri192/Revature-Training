package com.rwi.arrayProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class XYZ {

	public static void main(String[] args) {

		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//System.out.printf(Arrays.toString(array));  
		//Arrays.sort(array);
		System.out.println("After Sorted");
		for (int i = 0; i < array.length; i++)   
		{       
		  for(int j = i + 1; j < array.length; j++){
			  int temp =  0;
			  if(array[i] > array[j]){
				  temp = array[i];
				  array[i] = array[j];
				  array[j] = temp;
			  }
			  
		  }
		  System.out.println(array[i]);
		}   

	}

}
