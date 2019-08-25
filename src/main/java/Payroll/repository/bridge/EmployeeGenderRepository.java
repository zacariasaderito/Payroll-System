package Payroll.repository.bridge;

import Payroll.domain.bridge.EmployeeGender;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepository implements EmployeeGenderRepositoryInterface{

    private static EmployeeGenderRepository repository;
    private HashMap<String, EmployeeGender> employeeGenderHashMap;

    private EmployeeGenderRepository() {
            employeeGenderHashMap = new HashMap<>();
    }

    public static EmployeeGenderRepository getRepository() {
        if (repository == null)
            repository = new EmployeeGenderRepository();
        return repository;
    }


    // OVERRIDE METHODS
    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        this.employeeGenderHashMap.put(employeeGender.getEmployeeID(), employeeGender);
        return employeeGender;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        this.employeeGenderHashMap.replace(employeeGender.getEmployeeID(), employeeGender);
        return this.employeeGenderHashMap.get(employeeGender.getEmployeeID());
    }

    @Override
    public EmployeeGender read(String employeeGenderID) {
        return this.employeeGenderHashMap.get(employeeGenderID);
    }

    @Override
    public void delete(String employeeGenderID) {
        this.employeeGenderHashMap.remove(employeeGenderID);
    }

    @Override
    public Set<EmployeeGender> getAll() {
        Collection<EmployeeGender> employeeGenderCollection = employeeGenderHashMap.values();
        Set<EmployeeGender> employeeGenderSet = new HashSet<>();
        employeeGenderSet.addAll(employeeGenderCollection);
        return employeeGenderSet;
    }
}

