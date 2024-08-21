package com.datastructure.queue;

public class QueueNthElement {
	
	int front;
	int rear;
	int [] array;
	
	public QueueNthElement() {
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
	
	void delnth(int n) {
	    if (front == -1 || front > rear) {
	    	System.out.println("Error: Queue is empty\n");
	        return;
	    }
	    if (n <= 0 || n > rear - front + 1) {
	    	System.out.println("Error: Invalid position\n");
	        return;
	    }
	    for (int i = 1; i < n; i++) {
	        dequeue();
	    }
	    dequeue();
	}
	
	void display(){
		
		System.out.println("Queue elements are: ");
		    for (int i = front; i <= rear; i++) {
		    	System.out.println(array[i] + " ");
	}
	}
	
	public static void main(String[] args) {
		
		QueueNthElement ele = new QueueNthElement();
		
		ele.enqueue(4);
		ele.enqueue(5);
		ele.enqueue(3);
		ele.enqueue(7);
		ele.enqueue(8);
		ele.enqueue(6);
		ele.enqueue(9);
		ele.display();
		
		System.out.println("\nDelete the 8th element of the said queue:\n");
	    ele.delnth(8);
	   
	    System.out.println("\nDelete the 3rd element of the queue:\n");
	    ele.delnth(3);
		ele.display();

	}

}

