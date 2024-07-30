package com.revature.customer;

public class MainMethod {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Himanshu", "himanshu@example.com");
        Customer customer2 = new Customer("Harshal");
        
        System.out.println("Customer Details:");
        System.out.println(customer1);
        System.out.println(customer2);
        
        customer1.updateContactInfo("himanshu.new@example.com");
        customer2.updateContactInfo("Harshal Gorane", "harshal.gorane@example.com");

        System.out.println("\nUpdated Customer Details:");
        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println("\nTotal customers: " + Customer.getCustomerCount());

	}
}
