package com.ExceptionHandling;

public class ExitCommandTryBlock {
	
	public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            System.exit(0); 
        } finally {
            System.out.println("Finally Block!!");
        }
    }

}
