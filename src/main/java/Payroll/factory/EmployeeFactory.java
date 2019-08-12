package Payroll.factory;

import Payroll.GenerateID;
import Payroll.domain.Employee;
import Payroll.domain.Gender;
import Payroll.domain.Race;

public class EmployeeFactory {
    public static Employee getEmployee(String firstName, String lastName, Gender gender, Race race){
        return new Employee.Builder().employeeNumber(GenerateID.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .gender(gender)
                .race(race)
                .build();
    }
}
