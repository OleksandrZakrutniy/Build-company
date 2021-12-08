package com.company.AbstractClasses;

public abstract class Contractor {
    String name;
    int employeesCount;


    public Contractor() {
    }

    public Contractor(String name, int employeesCount) {
        this.name = name;
        this.employeesCount = employeesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }
}
