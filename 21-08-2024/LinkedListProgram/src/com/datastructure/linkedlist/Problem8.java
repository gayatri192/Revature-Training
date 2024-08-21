package com.datastructure.linkedlist;

import java.util.LinkedList;

//Write a Java Program to Insert the Specified Element at the end of a LinkedList

public class Problem8 {

	public static void main(String[] args) {
		
		LinkedList <String> color_list = new LinkedList <String> ();
		color_list.add("Pink");
		color_list.add("Red");
		color_list.add("Black");
		color_list.add("Yellow");
		System.out.println(" Given Linked List :" +color_list);
		color_list.offerLast("Green");
		System.out.println(" Updated Linked List is :" +color_list);
		

	}

}
