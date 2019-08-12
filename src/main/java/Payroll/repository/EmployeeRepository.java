package Payroll.repository;

import Payroll.domain.Employee;
import Payroll.repository.IRepository.IRepository;

import java.util.*;

public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}
