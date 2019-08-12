package Payroll.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {

    private String employeeNumber;
    private String firstName;
    private String lasName;
    private Gender gender;
    private Race race;

     private Employee(){}

     private Employee(Builder builder){
         this.employeeNumber = builder.employeeNumber;
         this.firstName = builder.firstName;
         this.lasName = builder.lastName;
         this.gender = builder.gender;
         this.race = builder.race;
     }


     public String getEmployeeNumber() { return employeeNumber;}
     public String getFirstName() {
            return firstName;
        }
     public String getLasName() {
            return lasName;
        }
    public Gender getGender() {
        return gender;
    }
    public Race getRace() {
        return race;
    }

    public static class Builder{
         private String employeeNumber;
         private String firstName;
         private String lastName;
         private Gender gender;
         private Race race;

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

            public Builder gender(Gender gender){
                this.gender = gender;
                return this;
            }

            public Builder race(Race race){
                this.race = race;
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
