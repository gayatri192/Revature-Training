package com.datastructure.queue;

public class ImpQueueUsingLinkedList {
	
	 Node front, rear; 
	 int currentSize;
	 
	 private class Node{ 
		 int data;
	     Node next;
	 }
	 
	 public ImpQueueUsingLinkedList(){
		 front = null;
	     rear = null;
	     currentSize = 0;
	 }
	 
	 public boolean isEmpty(){
		 return (currentSize == 0);
	 }
	 
	 public void enqueue(int data){
		 Node oldRear = rear;
	     rear = new Node();
	     rear.data = data;
	     rear.next = null;
	     if (isEmpty()){
	    	 front = rear;
	     }else {
	    	 oldRear.next = rear;
	     }
	     currentSize++;
	     System.out.println(data+ " Added to the queue");
	     }
	 
	 public int dequeue(){
		 int data = front.data;
	     front = front.next;
	     if (isEmpty()){
	    	 rear = null;
	     }
	     currentSize--;
	     System.out.println(data+ " Removed from the queue");
	     return data;
	 }

	public static void main(String[] args) {
		ImpQueueUsingLinkedList queue = new ImpQueueUsingLinkedList();
		
		queue.enqueue(4);
		queue.dequeue();
		queue.enqueue(5);
		queue.enqueue(3);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(6);
		queue.enqueue(9);
		queue.dequeue();
		

	}

}
