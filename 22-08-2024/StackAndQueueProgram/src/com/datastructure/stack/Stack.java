package com.datastructure.stack;

import java.util.Scanner;

public class Stack {

	 int[] array;
     int top;
    
   
    public Stack() {
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
	Stack s = new Stack();
	Scanner sc = new Scanner(System.in);
	
	do{
		System.out.println("\n----------Menu----------");
		System.out.println("\n 1.Push Operation");
		System.out.println("\n 2.Pop Operation");
		System.out.println("\n 3.Peek ");
		System.out.println("\n 4. IS Empty");
		System.out.println("\n 5. Display");
		System.out.println("\n 6. Exit");
		System.out.println("\n Enter your choice :");
		
		switch(sc.nextInt()){
		case 1:
			System.out.println("\n Enter the Value :");
			s.push(sc.nextInt());
			break;
		case 2:
			System.out.println("\n Popped Elements :" +s.pop());
			break;
		case 3:
			System.out.println("\n Peek Elements :" +s.peek());
			break;
		case 4:
			System.out.println("\n Is Empty Elements :" +s.isEmpty());
			break;
		case 5:
			s.display();
			break;
		case 6:
	        System.exit(0);
			break;
		default:
			System.out.println("\n Wrong Choice!!");
			break;
			
		
		}
		System.out.println("Do you want to continue..");
	}while(sc.nextInt() == 1);
	  
 }

	
}
