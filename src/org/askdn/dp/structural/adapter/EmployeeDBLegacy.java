package org.askdn.dp.structural.adapter;

/**
 * Created by ashish on 11/2/17 under MyDesignPatterns.
 */
public class EmployeeDBLegacy {
      private String CN;
      private String firstName;
      private String lastName;
      private String email;
      private int salaryInINR;

      EmployeeDBLegacy(String CN, String firstName, String lastName, String email, int salaryInINR) {
          this.CN = CN;
          this.firstName = firstName;
          this.lastName = lastName;
          this.email = email;
          this.salaryInINR = salaryInINR;
        }

    public String getUniqueID() {
        return CN;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getMailId() {
        return email;
    }

    public int getSalaryINR() {
        return salaryInINR;
    }

    @Override
    public String toString() {
        return "Unique Name: "+this.getUniqueID()
                +" FirstName: "+this.getFirstName()
                +" Last Name: "+this.getLastName()
                +" Mail: "+this.getMailId()
                +" Salary in INR: "+this.getSalaryINR();
    }
}