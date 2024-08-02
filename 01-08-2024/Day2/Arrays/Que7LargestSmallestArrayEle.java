package com.Day2.Arrays;

import java.util.Scanner;

public class Que7LargestSmallestArrayEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		int numbers[] = new int[size];
		
		for(int i= 0;i<size;i++){
			numbers[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<numbers.length;i++){
			if(numbers[i]>max){
				max = numbers[i];
			}
			if(numbers[i]<min){
				min = numbers[i];
			}
			
		}
		System.out.println("Largest number is:"+max);
		
		System.out.println("Smallest number is :"+min);

	}

}
