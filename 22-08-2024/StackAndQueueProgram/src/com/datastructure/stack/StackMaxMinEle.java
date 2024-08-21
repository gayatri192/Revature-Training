package com.datastructure.stack;

public class StackMaxMinEle {
	
	int[] array;
    int top;
   
  
   public StackMaxMinEle() {
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
   
   public int max() {
	    if (top == -1) {
	        System.out.println("Stack is empty");
	        return -1;
	    }

	    int x = array[0];

	    for (int i = 1; i <= top; i++) {
	        if (array[i] > x) {
	            x = array[i];
	        }
	    }

	    return x;
	  }

	  public int min() {
	    if (top == -1) {
	        System.out.println("Stack is empty");
	        return -1;
	    }

	    int y = array[0];

	    for (int i = 1; i <= top; i++) {
	        if (array[i] < y) {
	           y = array[i];
	        }
	    }

	    return y;
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
		StackMaxMinEle maxmin = new StackMaxMinEle();
		
		maxmin.push(10);
		maxmin.push(11);
		maxmin.push(12);
		maxmin.push(13);
		maxmin.push(14);
		maxmin.push(15);
		maxmin.push(16);
		maxmin.display();
		
		int maxVal = maxmin.max();
	    System.out.println("\nMaximum value in stack: " + maxVal);  
	    int minVal = maxmin.min();
		System.out.println("\nMinimum value in stack: " + minVal);



	}

}
