package Payroll.repository.impl;

import Payroll.domain.Employee;
import Payroll.factory.EmployeeFactory;
import Payroll.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {

    /**
     *
     */
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Aderito","Zacarias");
    }

    @Test
    public void create() {
        Employee generated = this.repository.create(this.employee);
        System.out.println("In create, generated Employee : " + generated.getFirstName() + " " + generated.getLasName());
        getAll();
        Assert.assertSame(generated,this.employee);
    }

    @Test
    public void update() {
        String newFirstName = "Daniel";
        String newLastName = "Joaquim";
        Employee updated = new Employee.Builder().firstName(newFirstName).lastName(newLastName).build();
        System.out.println("In update, About to update Employee : " + updated.getFirstName() + " " + updated.getLasName());
        this.repository.update(updated);
        System.out.println("In update, updated Employee to : " + updated.getFirstName() + " " + updated.getLasName());
        Assert.assertSame(newFirstName, updated.getFirstName());
    }

    @Test
    public void delete() {
        this.repository.delete(employee.getLasName());
    }

    @Test
    public void read() {
        System.out.println("In read, lastName : " + employee.getLasName());
        Employee read = this.repository.read(employee.getLasName());
        getAll();
        assertNotEquals(employee, read);
    }

    @Test
    public void getAll() {
        Set<Employee> getAll = this.repository.getAll();
    }
}