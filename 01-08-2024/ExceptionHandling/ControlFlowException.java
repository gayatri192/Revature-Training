package com.ExceptionHandling;

public class ControlFlowException extends Exception {
	
	public static void main(String[] args) {
     
        try {
            System.out.println("Starting try block");
            
            int result = 10 / 0; 
            System.out.println("Ending try block");
        } catch (ArithmeticException e) {
            System.out.println("Starting catch block");
           
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Ending catch block");
        } finally {
            System.out.println("Starting finally block");
           
            System.out.println("Ending finally block");
        }

        System.out.println("Ending main method");
    }
}
