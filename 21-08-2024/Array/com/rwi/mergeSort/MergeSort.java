package com.rwi.mergeSort;

public class MergeSort {
	
	private void conquer(int arr[], int left, int mid, int right) {
        
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[mid + 1 + j];

       int i = 0, j = 0;

        
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    
    private void divide(int arr[], int left, int right) {
        if (left >= right){
        	return;
        }
            // Find the middle point
            //int mid = (left + right) / 2;
        	int mid = left +(right - left)/2;

            // Sort first and second halves
            divide(arr, left, mid);
            divide(arr, mid + 1, right);

            // Merge the sorted halves
            conquer(arr, left, mid, right);
        
    }

    
    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.divide(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}

