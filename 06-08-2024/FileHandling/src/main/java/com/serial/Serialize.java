package com.serial;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Serialize {
	
	 public static void main(String[] args) {
	        String filePath = "E:\\Revature-Notes\\emp.txt";
	        HashMap<String, ColonSeparated> employeeMap = new HashMap<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                // Tokenize the line
	                StringTokenizer tokenizer = new StringTokenizer(line, ":");
	                if (tokenizer.countTokens() == 4) {
	                    String id = tokenizer.nextToken();
	                    String firstName = tokenizer.nextToken();
	                    String lastName = tokenizer.nextToken();
	                    String role = tokenizer.nextToken();

	                    // Create an Employee object
	                    ColonSeparated emp = new ColonSeparated(id, firstName, lastName, role);

	                    // Store the object in the HashMap
	                    employeeMap.put(id, emp);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Display the HashMap content
	        for (String key : employeeMap.keySet()) {
	            System.out.println("Key: " + key + " Value: " + employeeMap.get(key));
	        }
	    }
	}
