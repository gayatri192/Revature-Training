package com.datastructure.queue;

//Sort a queue in ascending order

public class QueueAscendingOrder {
	
	int front;
	int rear;
	int [] array;
	
	public QueueAscendingOrder() {
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
	
	void sort_queue_asc() {
	    int i, j, temp;
	    int n = rear - front + 1;

	    for (i = 0; i < n - 1; i++) {
	        for (j = i + 1; j < n; j++) {
	            if (array[i] > array[j]) {
	                temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
	}
	void display(){
		
		System.out.println("Queue elements are : ");
		    for (int i = front; i <= rear; i++) {
		    	System.out.println(array[i] + " ");
	}
	}


	public static void main(String[] args) {
		
		QueueAscendingOrder ele = new QueueAscendingOrder();
		
		ele.enqueue(4);
		ele.enqueue(5);
		ele.enqueue(3);
		ele.enqueue(7);
		ele.enqueue(8);
		ele.enqueue(6);
		ele.enqueue(9);
		ele.display();
	    
	    System.out.println("\nElements of the sorted queue in ascending order:\n");
	    ele.sort_queue_asc();
	    ele.display();

	}

}
