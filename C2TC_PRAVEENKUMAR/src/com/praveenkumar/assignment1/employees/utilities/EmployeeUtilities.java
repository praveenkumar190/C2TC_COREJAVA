package com.praveenkumar.assignment1.employees.utilities;

import com.praveenkumar.assignment1.employees.Employee;
import com.praveenkumar.assignment1.employees.Manager;
import com.praveenkumar.assignment1.employees.Developer;


public class EmployeeUtilities {

    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Salary: $" + employee.getSalary());
    }

    public static void giveRaise(Employee employee, double raisePercentage) {
        double currentSalary = employee.getSalary();
        employee.setSalary(currentSalary + (currentSalary * raisePercentage / 100));
    }

  
    public static void printManagerDetails(Manager manager) {
        System.out.println("Manager's Department: " + manager.getDepartment());
    }

 
    public static void printDeveloperDetails(Developer developer) {
        System.out.println("Developer's Programming Language: " + developer.getProgrammingLanguage());
    }
}