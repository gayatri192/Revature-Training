package com.datastructure.linkedlist;

import java.util.LinkedList;

//Write a Java Program to Insert some Elements at the Specified Position into a LinkedList

public class Problem2 {

	public static void main(String[] args) {
		
		LinkedList <String> fruits_list = new LinkedList <String> ();
		fruits_list.add("Apple");
		fruits_list.add("Banana");
		fruits_list.add("Guava");
		fruits_list.add("Cherry");
		fruits_list.add("Straberry");
		fruits_list.add("Papaya");
		
		System.out.println(" Given Linked List :" +fruits_list);
		LinkedList <String> new_fruits_list = new LinkedList <String>();
		new_fruits_list.add("Pineapple");
		new_fruits_list.add("Mulberry");
		fruits_list.addAll(3,new_fruits_list);
		System.out.println("Linked List :" +fruits_list);

	}

}
