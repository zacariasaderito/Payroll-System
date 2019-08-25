package Payroll.service.people;

import Payroll.domain.people.Employee;
import Payroll.repository.people.EmployeeRepository;

import java.util.Set;

public class EmployeeService implements EmployeeServiceInterface {

    private static EmployeeService service;
    private EmployeeRepository repository;

    private EmployeeService() {
        if (repository == null)
            repository = EmployeeRepository.getRepository();
    }

    public static EmployeeService getService() {
        if (service == null)
            service = new EmployeeService();
        return service;
    }


    // OVERRIDE METHODS
    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public Employee read(String employeeID) {
        return this.repository.read(employeeID);
    }

    @Override
    public void delete(String employeeID) {
        this.repository.delete(employeeID);
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }
}
