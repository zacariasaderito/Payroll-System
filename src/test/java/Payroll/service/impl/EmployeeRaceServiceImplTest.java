package Payroll.service.impl;

import Payroll.domain.Race;
import Payroll.factory.RaceFactory;
import Payroll.repository.RaceRepository;
import Payroll.repository.impl.RaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceServiceImplTest {

    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.getRace("African");
    }

    @Test
    public void create() {
        Race created = this.repository.create(this.race);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created, this.race);
    }

    @Test
    public void update() {
        String newRace = "black";
        Race updated = new Race.Builder().race(newRace).build();
        System.out.println("In update, about_to_updated = " + race.getRace());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newRace, updated.getRace());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(race.getRace());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, Race = "+ race.getRace());
        Race read = this.repository.read(race.getRace());
        getAll();
        assertNotEquals(race,read);
    }

    @Test
    public void getAll() {
        Set<Race> races = this.repository.getAll();
    }
}