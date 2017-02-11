package org.askdn.dp.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish on 11/2/17 under MyDesignPatterns.
 */
public class EmployeeClient {

    private List<Employee> emp = new ArrayList<>();

    public List<Employee> sendForPrint() {

        Employee v1 = new EmployeeDB("1234","Ashish","ashishkrish09@gmail.com",20000);
        emp.add(v1);

        /*
         *The statement below fails to compile. The Employee reference has no idea about the EmployeeDBLegacy class (which is pretty old).
         *
         * Employee v2 = new EmployeeDBLegacy("1245","Ashok", "Krishnan","ashokkrishnan@gmail.com",90000);
         *
         *
         * Here is where the Adapter Pattern comes into the picture.
         *
         * Our Aim is to create a Adapter that takes the old Type  and returns a reference of the newer type
         * Since, the new database implements a new Employee Interface. Adapter Classes can use this interface to adapt from
         * legacy code into the newer Employee Reference Type.
         *
         */


        Employee v2 = new ApapterForLegacy(new EmployeeDBLegacy("1245","Ashok", "Krishnan","ashokkrishnan@gmail.com",90000));
        emp.add(v2);

        return emp;
    }




}
