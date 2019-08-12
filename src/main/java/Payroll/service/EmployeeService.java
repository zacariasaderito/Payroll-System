package Payroll.service;

import Payroll.domain.Employee;
import Payroll.service.IService.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee,String> {
    Set<Employee> getAll();
}
