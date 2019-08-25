package Payroll.factory.people;

import Payroll.util.GenID;
import Payroll.domain.people.Employee;

public class EmployeeFactory {

   public static Employee getInstance(String firstName, String lastName) {
       return new Employee.Builder()
               .employeeNumber(GenID.generateID())
               .firstName(firstName)
               .lastName(lastName)
               .build();
   }
}
