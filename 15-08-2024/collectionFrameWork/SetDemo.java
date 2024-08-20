package com.collectionFrameWork;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		 Set<String> employeeSet=new HashSet<>();
	      //  Set<String> employeeSet=new TreeSet<>();
	       // Set<String> employeeSet=new LinkedHashSet<>();
	        employeeSet.add("Gayatree");
	        employeeSet.add("Harshu");
	        employeeSet.add("Rutu");
	        employeeSet.add("yash");
	        employeeSet.add("Sakshi");
	        employeeSet.add("Nitya");

	        for(String employee:employeeSet)
	            System.out.println(employee);

	}

}
