package com.rwi.arrayProgram;
import java.util.Arrays;

public class MergeTwoArrIntoOneSortedArray {

	public static void main(String[] args) {
        int arr1[] = {23, 56, 11, 34, 44, 55};
        int arr2[] = {77, 88, 13, 32, 22, 44};
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int newArray[] = mergeSort(arr1, arr2);
        
        System.out.println("Array1 = " + Arrays.toString(arr1));
        System.out.println("Array2 = " + Arrays.toString(arr2));
        System.out.println("Merged Array = " + Arrays.toString(newArray));
    }

    private static int[] mergeSort(int[] arr1, int[] arr2) {
        int merge[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        // Traverse both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }
        
        // Store remaining elements of arr1
        while (i < arr1.length) {
            merge[k++] = arr1[i++];
        }
        
        // Store remaining elements of arr2
        while (j < arr2.length) {
            merge[k++] = arr2[j++];
        }
        
        return merge;
    }
}