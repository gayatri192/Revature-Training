package com.revature;

public class BooleanOperation {

	public static void main(String[] args) {
		
		 boolean a = true;
	     boolean b = false;
	     
	     boolean nota = !a;
	     boolean aOrb = a | b;
	     boolean output = (!a & b) | (a & !b);

	     System.out.println("!a = " + nota);
	     System.out.println("a | b = " + aOrb);
	     System.out.println("(!a & b) | (a & !b) = " + output);
		

	}

}
