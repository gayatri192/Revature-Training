package com.ExceptionHandling;

public class DuckException {
	
	public static int demoMethod()throws ArithmeticException{

		int result = 10/0;

		return result;

	}
	
	public static void main(String[] args) {

	try {

		demoMethod();

	} catch (ArithmeticException e) {

		System.out.println("Exception Caught"+e.getMessage());;

	}

	

}	



}


