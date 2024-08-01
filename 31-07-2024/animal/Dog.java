package com.revature.animal;

public class Dog extends Canine {
	
	 @Override
	    public void makeNoise() {
	        System.out.println("Dog barks");
	    }

	    @Override
	    public void eat() {
	        System.out.println("Dog eats dog food");
	    }

}
