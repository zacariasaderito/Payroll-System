package Payroll.repository.impl;


import Payroll.domain.Race;

import Payroll.factory.RaceFactory;
import Payroll.repository.RaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.*;


public class RaceRepositoryImplTest {

    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.getRace("Coloured");
    }

    @Test
    public void create() {
        Race created = this.repository.create(this.race);
        System.out.println("In create, created : " + race.getRace());
        getAll();
        Assert.assertSame(created,this.race);
        Assert.assertEquals(race.getColoured(),this.race.getRace());

    }

    @Test
    public void update() {
        String newRace = "n";
        Race updated = new Race.Builder().race(newRace).build();
        System.out.println("In update, About to update : " + race.getRace());
        this.repository.update(updated);
        System.out.println("In update, updated to : " + updated.getRace());
        Assert.assertSame(newRace, updated.getRace());
    }

    @Test
    public void delete() {
        this.repository.delete(race.getRace());
    }

    @Test
    public void read() {
        System.out.println("In read, gender ID : " + race.getRace());
        Race read = this.repository.read(race.getRace());
        getAll();
        assertNotEquals(race, read);
    }

    @Test
    public void getAll() {
        Set<Race> all = this.repository.getAll();
    }
}

