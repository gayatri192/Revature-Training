package com.threadDemo;

public class TestRunnable {

	public static void main(String args[]) {
		RunnableThread R1 = new RunnableThread( "Thread-1");
	      Thread T1=new Thread(R1);// pass an instance of runnable to Thread Contructor
	      T1.start();
	      
	      RunnableThread R2 = new RunnableThread( "Thread-2");
	      Thread T2=new Thread(R2);
	      T2.start();
	   }   

}
