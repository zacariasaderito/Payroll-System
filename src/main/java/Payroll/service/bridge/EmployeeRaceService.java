package Payroll.service.bridge;

import Payroll.domain.bridge.EmployeeRace;
import Payroll.repository.bridge.EmployeeRaceRepository;

import java.util.Set;

public class EmployeeRaceService implements EmployeeRaceServiceInterface {

    private static EmployeeRaceService service;
    private EmployeeRaceRepository repository;

    private EmployeeRaceService() {
        if (repository == null)
            repository = EmployeeRaceRepository.getRepository();
    }

    public static EmployeeRaceService getService() {
        if (service == null)
            service = new EmployeeRaceService();
        return service;
    }

    //OVERRIDE METHODS
    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        return this.repository.create(employeeRace);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        return this.repository.update(employeeRace);
    }

    @Override
    public EmployeeRace read(String employeeRaceID) {
        return this.repository.read(employeeRaceID);
    }

    @Override
    public void delete(String employeeRaceID) {
        this.repository.delete(employeeRaceID);
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.repository.getAll();
    }
}
