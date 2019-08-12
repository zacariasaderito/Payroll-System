package Payroll.service;

import Payroll.domain.Gender;
import Payroll.service.IService.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<Gender,String> {
    Set<Gender> getAll();
}
