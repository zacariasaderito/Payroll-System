package Payroll.repository.impl;

import Payroll.domain.Race;
import Payroll.repository.RaceRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class RaceRepositoryImpl implements RaceRepository {

    private static  RaceRepositoryImpl repository = null;
    private Set<Race> raceTable;

    private RaceRepositoryImpl(){
        raceTable = new HashSet<>();
    }

    private Race findRace(final String raceID){
        return this.raceTable.stream()
                .filter(race -> race.getRace().trim().equals(raceID))
                .findAny()
                .orElse(null);
    }

    public static RaceRepository getRepository(){
        if(repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }


    @Override
    public Race create(Race race) {
        this.raceTable.add(race);
        return race;
    }

    @Override
    public Race update(Race race) {
        Race toDelete = findRace(race.getRace());
        if(toDelete != null){
            this.raceTable.remove(toDelete);
            return create(race);
        }
        return null;
    }

    @Override
    public void delete(String raceNum) {
        Race race = findRace(raceNum);
        if (race !=null) this.raceTable.remove(race);

    }

    @Override
    public Race read(String raceID) {
        Race race = findRace(raceID);
        return race;
    }

    @Override
    public Set<Race> getAll() {
        return this.raceTable;
    }
}
