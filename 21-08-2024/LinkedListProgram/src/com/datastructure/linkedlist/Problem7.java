package com.datastructure.linkedlist;

import java.util.LinkedList;

//Write a Java Program to Get the First and Last Occurrence of the Specified Elements in a LinkedList

public class Problem7 {

	public static void main(String[] args) {
		
		LinkedList <String> color_list = new LinkedList <String> ();
		color_list.add("Pink");
		color_list.add("Red");
		color_list.add("Black");
		color_list.add("Yellow");
		color_list.add("Green");
		System.out.println(" Given Linked List :" +color_list);
		Object color_li = color_list.getFirst();
		System.out.println("First Element :" +color_li);
		Object color_lis = color_list.getLast();
		System.out.println("Last Element :" +color_lis);
		
		
	}

}
