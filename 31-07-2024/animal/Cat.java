package com.revature.animal;

public class Cat extends Feline {
	
	@Override
    public void makeNoise() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats cat food");
    }

}
