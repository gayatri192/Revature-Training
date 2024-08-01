package com.revature.animal;

public class MainMethod {

	public static void main(String[] args) {
		 Animal lion = new Lion();
	        Animal tiger = new Tiger();
	        Animal cat = new Cat();
	        Animal hippo = new Hippo();
	        Animal wolf = new Wolf();
	        Animal dog = new Dog();

	        lion.makeNoise();
	        lion.eat();
	        lion.sleep();
	        lion.roam();

	        tiger.makeNoise();
	        tiger.eat();
	        tiger.sleep();
	        tiger.roam();

	        cat.makeNoise();
	        cat.eat();
	        cat.sleep();
	        cat.roam();

	        hippo.makeNoise();
	        hippo.eat();
	        hippo.sleep();
	        hippo.roam();

	        wolf.makeNoise();
	        wolf.eat();
	        wolf.sleep();
	        wolf.roam();

	        dog.makeNoise();
	        dog.eat();
	        dog.sleep();
	        dog.roam();
	    }
}
