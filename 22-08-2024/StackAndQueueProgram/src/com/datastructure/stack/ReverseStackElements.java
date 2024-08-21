package com.datastructure.stack;

//Write a Java program to reverse the elements of a given stack.

public class ReverseStackElements {
	
	 int[] array;
     int top;
    
   
    public ReverseStackElements() {
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
    
    public void reverse() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        int[] reversearr = new int[array.length];
        int index = 0;

        while (!isEmpty()) {
            int y = pop();
            reversearr[index++] = y;
        }

        for (int i = 0; i < index; i++) {
            push(reversearr[i]);
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
		ReverseStackElements ascending = new ReverseStackElements();
		
		ascending.push(10);
		ascending.push(12);
		ascending.push(9);
		ascending.push(13);
		ascending.push(11);
		ascending.push(15);
		ascending.push(18);
		ascending.display();
		System.out.println("\n Reverse the elements of a stack :");
		ascending.reverse();
		ascending.display();

	}

}
