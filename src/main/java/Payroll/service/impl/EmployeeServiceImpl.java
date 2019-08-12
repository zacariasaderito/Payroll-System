package Payroll.service.impl;

import Payroll.domain.Employee;
import Payroll.repository.EmployeeRepository;
import Payroll.repository.impl.EmployeeRepositoryImpl;
import Payroll.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService(){
        if (service == null) service = new EmployeeServiceImpl();
        return service;
    }
    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }
}
