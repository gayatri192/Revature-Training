package com.datastructure.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

//Write a Java Program to Iterate a LinkedList in Reverse Order

public class Problem9 {

	public static void main(String[] args) {
		
		LinkedList <String> color_list = new LinkedList <String> ();
		color_list.add("Pink");
		color_list.add("Red");
		color_list.add("Black");
		color_list.add("Yellow");
		System.out.println("Given Linked List :" +color_list);
		Iterator a = color_list.descendingIterator();
		System.out.println("\nElements in Reverse Order :");
		while(a.hasNext()){
			System.out.println(a.next());
		}

	}

}
