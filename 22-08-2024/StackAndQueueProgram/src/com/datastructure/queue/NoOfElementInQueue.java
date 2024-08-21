package com.datastructure.queue;

//Number of elements in a queue

import java.util.LinkedList;
import java.util.Queue;

public class NoOfElementInQueue {

	public static void main(String[] args) {
		
		Queue<String> student_list = new LinkedList<String>();
		student_list.add("Gayatri");
		student_list.add("Rutuja");
		student_list.add("Sujal");
		student_list.add("Priya");
		student_list.add("Riddhi");
		student_list.add("Trupti");
		student_list.add("Tanu");
		System.out.println("Queue Elements are : " + student_list);
	    System.out.println("Number of the elements in a Queue: " + student_list.size());

	}

}
