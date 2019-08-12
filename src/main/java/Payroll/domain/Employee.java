package Payroll.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {

    private String employeeNumber;
    private String firstName;
    private String lasName;

     private Employee(){}

     private Employee(Builder builder){
         this.firstName = builder.firstName;
         this.lasName = builder.lastName;
     }


     public String getEmployeeNumber() { return employeeNumber;}
     public String getFirstName() {
            return firstName;
        }
     public String getLasName() {
            return lasName;
        }

        public static class Builder{
         private String employeeNumber;
         private String firstName;
         private String lastName;

         public  Builder employeeNumber(String employeeNumber){
             this.employeeNumber = employeeNumber;
             return this;
         }

         public  Builder firstName(String firstName){
             this.firstName = firstName;
             return this;
         }

         public Builder lastName(String lastName){
             this.lastName = lastName;
             return this;
         }

         public Employee build(){
             return new Employee(this);
         }

            @Override
            public String toString() {
                return "Builder{" +
                        "employeeNumber" + employeeNumber + '\'' +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        '}';
            }
        }
}
