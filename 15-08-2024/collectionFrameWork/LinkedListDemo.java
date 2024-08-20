package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> ll = new LinkedList<String>();
		
		 ll.add("A");
	        ll.add("B");
	        ((LinkedList<String>) ll).addLast("C");
	        ((LinkedList<String>) ll).addFirst("D");
	        ll.add(2, "E");
	 
	        System.out.println(ll);
	 
	        ll.remove("B");
	        System.out.println("After Removing 'B' " +ll);
	        ll.remove(3);
	        System.out.println("After Removing at Index 3 "+ll);
	        ((LinkedList<String>) ll).removeFirst();
	        System.out.println("After Removing First "+ll);
	        ((LinkedList<String>) ll).removeLast();
	        System.out.println("After Removing Last "+ll);
	        System.out.println(ll);
	        
	        ll.add("B");
	        System.out.println(ll);
	        ll.set(1, "BB");
	        System.out.println(ll);
	        Iterator<String> llItr=ll.iterator();
	        while(llItr.hasNext())
	        	System.out.println(llItr.next());

}
}
