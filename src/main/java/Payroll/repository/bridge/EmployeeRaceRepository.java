package Payroll.repository.bridge;

import Payroll.domain.bridge.EmployeeRace;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EmployeeRaceRepository implements EmployeeRaceRepositoryInterface{

    private static EmployeeRaceRepository repository;
    private HashMap<String, EmployeeRace> employeeRaceHashMap;

    // Constructor
    private EmployeeRaceRepository() {
            this.employeeRaceHashMap = new HashMap<>();
    }


    public static EmployeeRaceRepository getRepository() {
        if (repository == null)
            repository = new EmployeeRaceRepository();

        return repository;
    }

    // OVERRIDE METHODS
    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        this.employeeRaceHashMap.put(employeeRace.getEmployeeID(), employeeRace);
        return employeeRace;
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        this.employeeRaceHashMap.replace(employeeRace.getEmployeeID(), employeeRace);
        return this.employeeRaceHashMap.get(employeeRace.getEmployeeID());
    }

    @Override
    public EmployeeRace read(String employeeRaceID) {
        return this.employeeRaceHashMap.get(employeeRaceID);
    }

    @Override
    public void delete(String employeeRaceID) {
        this.employeeRaceHashMap.remove(employeeRaceID);
    }

    @Override
    public Set<EmployeeRace> getAll() {
        Collection<EmployeeRace> employeeRaceCollection = this.employeeRaceHashMap.values();
        Set<EmployeeRace> employeeRaceHashSet = new HashSet<>();
        employeeRaceHashSet.addAll(employeeRaceCollection);
        return employeeRaceHashSet;
    }
}
