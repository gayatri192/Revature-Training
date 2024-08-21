package com.datastructure.queue;

public class AverageValofQueue {
	
	int front;
	int rear;
	int [] array;
	
	public AverageValofQueue() {
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
	
	float average() {
	    if (front == -1 || front > rear) {
	    	System.out.println("Err - Queue is empty\n");
	        return 0;
	    }
	    float sum = 0;
	    int count = 0;
	    for (int i = front; i <= rear; i++) {
	        sum += array[i];
	        count++;
	    }
	    float res = sum/count;
	    return res;
	}
	void display(){
		
		System.out.println("Queue elements are : ");
		    for (int i = front; i <= rear; i++) {
		    	System.out.println(array[i] + " ");
	}
	}

	public static void main(String[] args) {
		
		AverageValofQueue ele = new AverageValofQueue();
		
		ele.enqueue(4);
		ele.enqueue(5);
		ele.enqueue(3);
		ele.enqueue(7);
		ele.enqueue(8);
		ele.enqueue(6);
		ele.enqueue(9);
		ele.display();
		
		float avg = ele.average();
		System.out.println("Average of the elements in the queue is: \n" +avg);

	}

}
