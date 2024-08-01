package com.revature.animal;

public class Hippo implements Animal {
	
	    @Override
	    public void makeNoise() {
	        System.out.println("Hippo grunts");
	    }

	    @Override
	    public void eat() {
	        System.out.println("Hippo eats grass");
	    }

	    @Override
	    public void sleep() {
	        System.out.println("Hippo is sleeping");
	    }

	    @Override
	    public void roam() {
	        System.out.println("Hippo is roaming");
	    }

}
