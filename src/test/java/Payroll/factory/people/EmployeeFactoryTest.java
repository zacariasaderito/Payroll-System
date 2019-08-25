package Payroll.factory.people;

import Payroll.domain.people.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void getInstance() {
        Employee employee = EmployeeFactory.getInstance("Aderito", "Zacarias");
        assertEquals("Aderito", employee.getFirstName());
    }
}