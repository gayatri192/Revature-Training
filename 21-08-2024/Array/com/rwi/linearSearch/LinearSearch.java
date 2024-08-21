package com.rwi.linearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50};
		int targetNo = 40;
		
		int index = linearSearch(array, targetNo);
		
		if(index != -1){
			System.out.println("Element " + targetNo + " found at index " + index);
        } else {
            System.out.println("Element " + targetNo + " not found in the array");
        }

	}

	private static int linearSearch(int[] array, int targetNo) {
		
		for(int i = 0; i<array.length; i++){
			if(array[i] == targetNo){
				return i;
			}
		}
		return -1;
	}

}
