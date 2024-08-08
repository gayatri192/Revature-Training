package com.serial;

import java.io.Serializable;

public class ColonSeparated implements Serializable {

	private String id;
	private String firstName;
	private String lastName;
	private String role;
	
    private transient String jobTitle;
	public ColonSeparated() {
		super();
	}
	public ColonSeparated(String employeeId, String firstName, String lastName, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString() {
		return "ColonSeparated [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role
				+ ", jobTitle=" + jobTitle + "]";
	}
	
	
	

}
