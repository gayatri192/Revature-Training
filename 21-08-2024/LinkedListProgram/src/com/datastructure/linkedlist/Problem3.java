package com.datastructure.linkedlist;

import java.util.LinkedList;

//Write a Java Program to Insert Elements into the LinkedList at the First and Last position

public class Problem3 {

	public static void main(String[] args) {
		
		LinkedList <String> student_list = new LinkedList <String> ();
		student_list.add("Gayatri");
		student_list.add("Rutuja");
		student_list.add("Sujal");
		student_list.add("Priya");
		System.out.println("The given Linked List :" +student_list);
		student_list.addFirst("Priti");
		student_list.addLast("Sakshi");
		System.out.println("The list after adding elements is :" +student_list);

	}

}
