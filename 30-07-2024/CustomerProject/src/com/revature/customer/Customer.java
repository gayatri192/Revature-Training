package com.revature.customer;

public class Customer {
	
	private static int customerCount = 0;

    private final int customerID;

    private String name;
    private String email;

    
    public Customer(String name, String email) {
        this.customerID = ++customerCount; 
        this.name = name;
        this.email = email;
    }

    public Customer(String name) {
        this(name, "No email provided"); 
    }
    public void updateContactInfo(String newEmail) {
        this.email = newEmail;
    }

    public void updateContactInfo(String newName, String newEmail) {
        this.name = newName;
        this.email = newEmail;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerID + ", Name: " + name + ", Email: " + email;
    }
}

	

