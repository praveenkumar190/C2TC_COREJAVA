package com.praveenkumar.assignment1;
import com.praveenkumar.assignment1.employees.Manager;
import com.praveenkumar.assignment1.employees.Developer;
import com.praveenkumar.assignment1.employees.utilities.EmployeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("Selvaa", 1001, 95000, "javamanager");
        Developer developer = new Developer("Arunkumar", 1002, 90000, "Java");

        // Print initial details of employees
        System.out.println("Initial Employee Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        // Print specific details for Manager and Developer
        EmployeeUtilities.printManagerDetails(manager);
        EmployeeUtilities.printDeveloperDetails(developer);

        // Give a raise to both employees
        EmployeeUtilities.giveRaise(manager, 5);  // 5% raise
        EmployeeUtilities.giveRaise(developer, 7); // 7% raise

        // Print updated details
        System.out.println("\nUpdated Employee Details After Raise:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}