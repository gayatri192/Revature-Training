package com.datastructure.queue;


public class ImplementQueue {
	
	int front;
	int rear;
	int [] array;
	
	public ImplementQueue() {
	       array = new int[100];
	       rear = -1;
	   }
	
	 
	void enqueue(int a){
		
		if(rear == array.length -1){
			System.out.println("Overflow");
		}else
			array[++rear] = a;
		
		if(front == -1)
			front ++;
		
	}
	
	void dequeue(){
		int x = -1;
		if(front == -1){
			System.out.println("Underflow");
		}else
			x = array[front++];
	    
		if(rear == 0)
			rear--;
		return;
	}
	void display(){
		
		System.out.println("Queue elements are: ");
		    for (int i = front; i <= rear; i++) {
		    	System.out.println(array[i] + " ");
	}
	}
	
	public static void main(String[] args) {
		
		ImplementQueue ele = new ImplementQueue();
		
		// inserting elements in the queue
		ele.enqueue(4);
		ele.enqueue(5);
		ele.enqueue(3);
		ele.enqueue(7);
		ele.enqueue(8);
		ele.enqueue(6);
		ele.enqueue(9);
		ele.dequeue();
		ele.display();

	}

}
