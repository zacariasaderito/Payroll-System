package Payroll.service;

import Payroll.domain.Race;
import Payroll.service.IService.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<Race,String> {
    Set<Race> getAll();
}
