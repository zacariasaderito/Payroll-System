package Payroll.service.demographic;

import Payroll.domain.demographic.Race;
import Payroll.repository.demographic.RaceRepository;

import java.util.Set;

public class RaceService implements RaceServiceInterface {

    private static RaceService service;
    private RaceRepository repository;

    private RaceService() {
        if (repository == null)
            repository = RaceRepository.getRepository();
    }

    public static RaceService getService() {
        if (service == null)
            service = new RaceService();
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
    public Race read(String raceID) {
        return this.repository.read(raceID);
    }

    @Override
    public void delete(String raceID) {
        this.repository.delete(raceID);
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }
}
