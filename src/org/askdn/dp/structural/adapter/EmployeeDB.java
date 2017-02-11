package org.askdn.dp.structural.adapter;

/**
 * Created by ashish on 11/2/17 under MyDesignPatterns.
 */
public class EmployeeDB implements Employee {

    String name;
    String id;
    String email;
    int salary;

    EmployeeDB(String id, String name, String email, int salary) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.salary = salary;
    }


    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return "Name: "+this.getName()+" ID: "+this.getID()+" Email: "+this.getEmail()+" Salary: "+this.getSalary();
    }
}
