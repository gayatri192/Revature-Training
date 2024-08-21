package com.datastructure.linkedlist;

import java.util.LinkedList;

//Write a Java Program to Insert the Specified Element at the Specified Position in the LinkedList

public class Problem1 {

	public static void main(String[] args) {
		
		LinkedList <String> student_list = new LinkedList <String> ();
		student_list.add("Gayatri");
		student_list.add("Rutuja");
		student_list.add("Sujal");
		student_list.add("Priya");
		student_list.add("Riddhi");
		student_list.add("Trupti");
		student_list.add("Tanu");
		System.out.println("Linked List :" +student_list);
		System.out.println("Add the next student in the list..");
		student_list.add(3,"Janhvi");
		System.out.println("Linked List :" +student_list);
		

	}

}
