package com.ExceptionHandling;

import java.util.Scanner;

public class FinallyBlock {
	
public static void main(String[] args) {
		
		int a , b , c = 0;
		Scanner sc = new Scanner(System.in);
		
		try{
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		finally{
			System.out.println(c);
			System.out.println("Goodbye");
		}
		
	}

}
