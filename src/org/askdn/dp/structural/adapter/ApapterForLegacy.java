package org.askdn.dp.structural.adapter;

/**
 * Created by ashish on 11/2/17 under MyDesignPatterns.
 */
public class ApapterForLegacy implements Employee {
    EmployeeDBLegacy employeeDBLegacy;

    ApapterForLegacy(EmployeeDBLegacy employeeDBLegacy) {
        this.employeeDBLegacy = employeeDBLegacy;
    }


    @Override
    public String getID() {
        return employeeDBLegacy.getUniqueID();
    }

    @Override
    public String getName() {
        return employeeDBLegacy.getFirstName() +" "+ employeeDBLegacy.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeDBLegacy.getMailId();
    }

    @Override
    public int getSalary() {
        return employeeDBLegacy.getSalaryINR() * 67;
    }

    @Override
    public String toString() {
        return "Name: "+this.getName()+" ID: "+this.getID()+" Email: "+this.getEmail()+" Salary: "+this.getSalary();
    }
}
