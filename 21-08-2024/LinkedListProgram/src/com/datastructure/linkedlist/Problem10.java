package com.datastructure.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

//Write a Java Program to Iterate through all Elements in a LinkedList starting at the specified position

public class Problem10 {

	public static void main(String[] args) {
		LinkedList <String> fruits_list = new LinkedList <String> ();
		fruits_list.add("Apple");
		fruits_list.add("Banana");
		fruits_list.add("Guava");
		fruits_list.add("Cherry");
		fruits_list.add("Straberry");
		System.out.println("The Given Linked List is :" +fruits_list);
		Iterator a = fruits_list.listIterator(2);
		while(a.hasNext()){
			System.out.println(a.next());
		}

	}

}
