package com.ExceptionHandling;

public class CustomException extends Exception {
	
	public CustomException(String msg) {
        super(msg);
    }

}
class ExceptionThrow {
    
    public void doSomethingRisky() throws CustomException {
        
        
        throw new CustomException("Something went wrong!");
    }
    
    public static void main(String[] args) {
        ExceptionThrow thro = new ExceptionThrow();
        
        try {
            thro.doSomethingRisky();
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
