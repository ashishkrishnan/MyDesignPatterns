package org.askdn.dp.structural.adapter;

/**
 * Created by ashish on 11/2/17 under MyDesignPatterns.
 */
public class RunAdapterDemo {

    public static void main(String args[]) {
        EmployeeClient ec = new EmployeeClient();
        for(Employee e: ec.sendForPrint()) {
            System.out.println(e); // This will be bind to the overriden toString() method in the EmployeeDB class
        }
    }

}
