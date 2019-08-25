package Payroll.service.bridge;

import Payroll.domain.bridge.EmployeeGender;
import Payroll.repository.bridge.EmployeeGenderRepository;

import java.util.HashMap;
import java.util.Set;

public class EmployeeGenderService implements EmployeeGenderServiceInterface {

    private static EmployeeGenderService service;
    private EmployeeGenderRepository repository;

    private EmployeeGenderService () {
        if (repository == null)
            repository = EmployeeGenderRepository.getRepository();
    }

    public static EmployeeGenderService getService() {
        if (service == null)
            service = new EmployeeGenderService();
        return service;
    }

    //OVERRIDER METHODS
    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.repository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.repository.update(employeeGender);
    }

    @Override
    public EmployeeGender read(String employeeGenderID) {
        return this.repository.read(employeeGenderID);
    }

    @Override
    public void delete(String employeeGenderID) {
        this.repository.delete(employeeGenderID);
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return this.repository.getAll();
    }
}
