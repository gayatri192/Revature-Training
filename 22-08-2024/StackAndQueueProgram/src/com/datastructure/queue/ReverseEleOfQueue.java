package com.datastructure.queue;

//Reverse the elements of a queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseEleOfQueue {
	
	 private static void reverseQueue(Queue<Integer> queue) {
	        int n = queue.size();
	        Stack<Integer> stack = new Stack<>();
	        
	        for (int i = 0; i < n; i++) {
	            int curr = queue.poll();
	            stack.push(curr);
	        }
	        
	        for (int i = 0; i < n; i++) {
	            int curr = stack.pop();
	            queue.add(curr);
	        }

	        for (Integer i : queue) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		
		Queue<Integer> a = new LinkedList<>();
		a.add(10);
        a.add(8);
        a.add(4);
        a.add(23);
        a.add(10);
        a.add(8);
        a.add(4);
        a.add(23);
		reverseQueue(a);
		System.out.println("Reverse the elements of a queue :");
		reverseQueue(a);

	}

}
