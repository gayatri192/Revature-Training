package com.datastructure.linkedlist;

import java.util.LinkedList;

//Write a Java Program to Insert the Specified Element at the Front of a LinkedList

public class Problem5 {

	public static void main(String[] args) {
		
		LinkedList <String> student_list = new LinkedList <String> ();
		student_list.add("Gayatri");
		student_list.add("Rutuja");
		student_list.add("Sujal");
		student_list.add("Priya");
		student_list.add("Riddhi");
		System.out.println(" Given Linked List :" +student_list);
		student_list.offerFirst("Harshu");
		System.out.println(" Updated Linked List is :" +student_list);

	}

}
