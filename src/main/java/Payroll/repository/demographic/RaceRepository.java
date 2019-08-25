package Payroll.repository.demographic;

import Payroll.domain.demographic.Race;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RaceRepository implements RaceRepositoryInterface{

    private static RaceRepository repository;
    private HashMap<String, Race> raceHashMap;

    private RaceRepository() {
        raceHashMap = new HashMap<>();
    }

    public static RaceRepository getRepository() {
        if (repository == null)
            repository = new RaceRepository();
        return repository;
    }


    @Override
    public Race create(Race race) {
        this.raceHashMap.put(race.getId(), race);
        return race;
    }

    @Override
    public Race update(Race race) {
        this.raceHashMap.replace(race.getId(), race);
        return this.raceHashMap.get(race.getId());
    }

    @Override
    public Race read(String raceID) {
        return this.raceHashMap.get(raceID);
    }

    @Override
    public void delete(String raceID) {
        this.raceHashMap.remove(raceID);
    }

    @Override
    public Set<Race> getAll() {
        Collection<Race> raceCollection = raceHashMap.values();
        Set<Race> raceSet = new HashSet<>();
        raceSet.addAll(raceCollection);
        return raceSet;
    }
}
