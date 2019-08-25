package Payroll.repository.people;

import Payroll.domain.people.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository implements EmployeeRepositoryInterface {

    private static EmployeeRepository repository;
    private HashMap<String, Employee> employeeHashMap;

    private EmployeeRepository() {
        employeeHashMap = new HashMap<>();
    }

    public static EmployeeRepository getRepository() {
        if (repository == null)
            repository = new EmployeeRepository();
        return repository;
    }


    @Override
    public Employee create(Employee employee) {
        this.employeeHashMap.put(employee.getEmployeeNumber(), employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        this.employeeHashMap.replace(employee.getEmployeeNumber(), employee);
        return this.employeeHashMap.get(employee.getEmployeeNumber());
    }

    @Override
    public Employee read(String employeeID) {
        return this.employeeHashMap.get(employeeID);
    }

    @Override
    public void delete(String employeeID) {
        this.employeeHashMap.remove(employeeID);
    }

    @Override
    public Set<Employee> getAll() {
        Collection<Employee> employeeCollection = employeeHashMap.values();
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.addAll(employeeCollection);
        return employeeSet;
    }
}
