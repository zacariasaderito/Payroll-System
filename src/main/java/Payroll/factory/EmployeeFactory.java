package Payroll.factory;

import Payroll.GenerateID;
import Payroll.domain.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String firstName, String lastName){
        return new Employee.Builder().employeeNumber(GenerateID.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
