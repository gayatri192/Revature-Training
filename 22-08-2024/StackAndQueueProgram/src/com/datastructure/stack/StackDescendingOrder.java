package com.datastructure.stack;

public class StackDescendingOrder {
	
	int[] array;
    int top;
   
  
   public StackDescendingOrder() {
       array = new int[100];
       top = -1;
   }
   
   
   public void push(int x) {
       if (top == array.length - 1) {
           System.out.println("Overflow");
       } else {
           array[++top] = x;
       }
   }
   
   
   public int pop() {
       if (top == -1) {
           System.out.println("Underflow");
           return -1;
       } else
       	return(array[top--]);
           
       
   }
   
   public int peek() {
       if (top == -1) {
           System.out.println("Stack is empty");
           return -1;
       } else {
           return array[top];
       }
   }
   

   public boolean isEmpty() {
       return top == -1;
   }
   
   public void sort() {
	    if (top == -1) {
	        System.out.println("Stack is empty");
	        return;
	    }
	    
	    StackDescendingOrder tempStack = new StackDescendingOrder();

	    while (!isEmpty()) {
	        int y = pop();

	        while (!tempStack.isEmpty() && tempStack.peek() < y) {
	            push(tempStack.pop());
	        }

	        tempStack.push(y);
	    }
	    while (!tempStack.isEmpty()) {
	        int y = tempStack.pop();
	        push(y);
	    }
	}
   
   public void display() {
   	if (top == -1) {
   		System.out.println("Stack is empty");
   		} else {
   			System.out.print("Stack elements: ");
   			for (int i = top; i >= 0; i--) {
   				System.out.print(array[i] + " ");
   		    }
   			System.out.println();
   		}
   }

	public static void main(String[] args) {
		
		System.out.println("Initialize a stack:");
		StackDescendingOrder descending = new StackDescendingOrder();
		
		descending.push(10);
		descending.push(11);
		descending.push(12);
		descending.push(13);
		descending.push(14);
		descending.push(15);
		descending.push(16);
		descending.display();
		System.out.println("\n Sort the elements of the stack in descending order is :");
		descending.sort();
		descending.display();

	}

}
