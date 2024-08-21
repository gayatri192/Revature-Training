package com.datastructure.queue;

public class MinEleofQueue {
	
	int front;
	int rear;
	int [] array;
	
	public MinEleofQueue () {
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
	
	int min() {
	    if (front == -1 || front > rear) {
	    	System.out.println("Error: Queue is empty\n");
	        return -1;
	    }
	    int min = array[front];
	    for (int i = front; i <= rear; i++) {
	        if (array[i] < min) {
	            min = array[i];
	        }
	    }
	    return min;
	}
	void display(){
		
		System.out.println("Queue elements are : ");
		    for (int i = front; i <= rear; i++) {
		    	System.out.println(array[i] + " ");
	}
	}
	

	public static void main(String[] args) {
		
		MinEleofQueue ele = new MinEleofQueue();
		
		ele.enqueue(4);
		ele.enqueue(5);
		ele.enqueue(3);
		ele.enqueue(7);
		ele.enqueue(8);
		ele.enqueue(6);
		ele.enqueue(9);
		ele.display();
		
		int minVal = ele.min();
		System.out.println("Minimum value in the queue is: \n"+ minVal);


	}

}
