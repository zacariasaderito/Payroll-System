package Payroll.domain.people;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Employee {

    private String employeeNumber;
    private String firstName;
    private String lastName;


     private Employee(){}

    //Private Constructor
    private Employee(Builder builder){
         this.employeeNumber = builder.employeeNumber;
         this.firstName = builder.firstName;
         this.lastName = builder.lastName;
     }

     public String getEmployeeNumber() { return employeeNumber;}
     public String getFirstName() {
            return firstName;
        }
     public String getLasName() {
            return lastName;
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

     } // Builder

    @Override
    public String toString() {
        return "Builder{" +
                "employeeNumber" + employeeNumber + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
