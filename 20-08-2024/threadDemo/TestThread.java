package com.threadDemo;

public class TestThread {
	
	public static void main(String[] args){
		
		ThreadDe t1 = new ThreadDe("Thread-1");
		t1.start(); // started or runnable 
		    //  T1.run(); // this will be a noraml method call not the threaded call
		ThreadDe t2 = new ThreadDe( "Thread-2");
	    t2.start();
	}

}
