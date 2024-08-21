package com.datastructure.queue;

//Remove an element from a queue

import java.util.LinkedList;
import java.util.Queue;

public class RemoveEleFromQueue {

	public static void main(String[] args) {
	      Queue<String> student_list = new LinkedList<String>();
			student_list.add("Gayatri");
			student_list.add("Rutuja");
			student_list.add("Sujal");
			student_list.add("Priya");
			student_list.add("Riddhi");
			student_list.add("Trupti");
			student_list.add("Tanu");
			System.out.println("Queue Elements :" +student_list);
	      System.out.println("Queue head = " + student_list.element());
	      System.out.println("Removing element from queue = " + student_list.remove());
	      System.out.println("Remaining Queue elements...");
	      Object ob;
	      while ((ob = student_list.poll()) != null) {
	         System.out.println(ob);
	      }
	}

}
