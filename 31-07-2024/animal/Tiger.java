package com.revature.animal;

public class Tiger extends Feline {
	
	@Override
    public void makeNoise() {
        System.out.println("Tiger growls");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats meat");
    }

}
