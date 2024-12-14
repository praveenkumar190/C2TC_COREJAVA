package com.praveenkumar.assignment1.employees;

public class Manager extends Employee {
	    private String department;

	    // Constructor to initialize the Manager object
	    public Manager(String name, int employeeId, double salary, String department) {
	        super(name, employeeId, salary);  // Call to Employee constructor
	        this.department = department;
	    }

	    // Getter and Setter methods for department
	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
}
}