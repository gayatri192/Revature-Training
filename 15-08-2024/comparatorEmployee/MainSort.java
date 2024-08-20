package com.comparatorEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSort {
	
	public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();

	        // Adding some employees to the list
	        employees.add(new Employee(3, "Riya", 7500));
	        employees.add(new Employee(1, "Nandini", 50000));
	        employees.add(new Employee(2, "Anshika", 60000));
	        employees.add(new Employee(5, "Harshu", 90000));
	        employees.add(new Employee(4, "Yash", 75000));

	        // Sort by ID
	        Collections.sort(employees, Comparator.comparing(Employee::getId));
	        System.out.println("Employees Sorted by ID:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }

	        // Sort by Name
	        Collections.sort(employees, Comparator.comparing(Employee::getName));
	        System.out.println("\nEmployees Sorted by Name:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }

	        // Sort by Salary
	        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
	        System.out.println("\nEmployees Sorted by Salary:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }
	}

