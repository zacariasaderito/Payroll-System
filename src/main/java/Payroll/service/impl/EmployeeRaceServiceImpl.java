package Payroll.service.impl;

import Payroll.domain.Race;
import Payroll.repository.RaceRepository;
import Payroll.repository.impl.RaceRepositoryImpl;
import Payroll.service.EmployeeRaceService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class EmployeeRaceServiceImpl implements EmployeeRaceService {
    private static EmployeeRaceServiceImpl service = null;
    private RaceRepository repository;

    private EmployeeRaceServiceImpl(){
        this.repository = RaceRepositoryImpl.getRepository();
    }

    public static EmployeeRaceServiceImpl getService(){
        if (service == null) service = new EmployeeRaceServiceImpl();
        return service;
    }
    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String i) {
        this.repository.delete(i);
    }

    @Override
    public Race read(String i) {
        return this.repository.read(i);
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }
}
