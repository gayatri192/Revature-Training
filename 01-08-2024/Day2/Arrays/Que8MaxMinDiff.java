package com.Day2.Arrays;

import java.util.Scanner;

public class Que8MaxMinDiff {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n < 2) {
            System.out.println("Array needs at least two elememts:");
            return;
        }

        int max = arr[0], min = arr[0];
        int minIndex = 0, secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != minIndex && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        int maxDiff = max - min;
        int minDiff = secondMin - min;

        System.out.println("Pair with maximum difference: (" + min + ", " + max + ")");
        System.out.println("Maximum difference: " + maxDiff);

        System.out.println("Pair with minimum difference: (" + min + ", " + secondMin + ")");
        System.out.println("Minimum difference: " + minDiff);
    }

	

}
