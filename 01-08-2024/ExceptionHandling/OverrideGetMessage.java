package com.ExceptionHandling;

public class OverrideGetMessage extends Exception {
	
	public OverrideGetMessage(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return "Custom Message: " + super.getMessage();
    }

}
class ExceptionTh {
    
    public void doSomething() throws CustomException {
        
        
        throw new CustomException("Something went wrong!");
    }
    
    public static void main(String[] args) {
        ExceptionTh thro = new ExceptionTh();
        
        try {
            thro.doSomething();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

}
