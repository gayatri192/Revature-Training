package com.revature.animal;

public abstract class Canine implements Animal {
	
	protected String picture;
    protected String food;
    protected int hunger;
    protected String boundaries;
    protected String location;

    @Override
    public void sleep() {
        System.out.println("Canine is sleeping");
    }

    @Override
    public void roam() {
        System.out.println("Canine is roaming");
    }

}
