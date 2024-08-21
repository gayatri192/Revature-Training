package com.rwi.binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		int targetNo = 40;
		
		int index = binarySearch(array, targetNo);
		
		if(index != -1){
			System.out.println("Element " + targetNo + " found at index " + index);
        } else {
            System.out.println("Element " + targetNo + " not found in the array");
        }

	}

	private static int binarySearch(int[] array, int targetNo) {
		int leftNo = 0;
		int rightNo = array.length - 1;
		
		while(leftNo <= rightNo){
			int mid = leftNo + (rightNo - leftNo) / 2;
			
			if(array[mid] == targetNo){
				return mid;
			}
			
			if(array[mid] < targetNo){
				leftNo = mid + 1;
			}else{
				rightNo = mid -1;
			}
		}
		
		
		return -1;
	}

}
