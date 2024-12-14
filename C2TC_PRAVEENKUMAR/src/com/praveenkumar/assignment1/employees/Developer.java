package com.praveenkumar.assignment1.employees;

public class Developer extends Employee {
    private String programmingLanguage;

    // Constructor to initialize the Developer object
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);  // Call to Employee constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Getter and Setter methods for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
}
}