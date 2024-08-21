package com.datastructure.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

//Write a Java Program to Iterate through all Elements in a LinkedList

public class Problem6 {

	public static void main(String[] args) {
		
		LinkedList <String> student_list = new LinkedList <String> ();
		student_list.add("Gayatri");
		student_list.add("Rutuja");
		student_list.add("Sujal");
		student_list.add("Priya");
		student_list.add("Riddhi");
		Iterator a = student_list.listIterator(2);
		while(a.hasNext()){
			System.out.println(a.next());
		}

	}

}
