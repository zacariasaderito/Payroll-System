package Payroll.repository.impl;

import Payroll.domain.Employee;
import Payroll.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> employees;

    private EmployeeRepositoryImpl(){
        this.employees = new HashMap<>();
    }

//    FIND METHOD
//    private Employee findEmployee(final String lastName){
//        return this.employees.stream()
//                .filter(employee -> employee.getLasName().trim().equals(lastName))
//                .findAny()
//                .orElse(null);
//    }

    public static EmployeeRepositoryImpl getRepository() {
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.put(employee.getEmployeeNumber(), employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        this.employees.replace(employee.getEmployeeNumber(), employee);
        return this.employees.get(employee.getFirstName());

//        Employee removebleEmployee = findEmployee(employee.getLasName());
//        if(removebleEmployee != null){
//            this.employees.remove(removebleEmployee);
//            return create(employee);
//        }
//        return null;
    }

    @Override
    public void delete(String empNum) {
        this.employees.remove(empNum);
    }

    @Override
    public Employee read(String empNum) {
        return this.employees.get(empNum);
    }

    @Override
    public Set<Employee> getAll() {
        Collection<Employee> employeeCollection = this.employees.values() ;
        HashSet<Employee> set = new HashSet<>();
        set.addAll(employeeCollection);
        return set;
    }
}
