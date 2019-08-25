package Payroll.factory.demographic;

import Payroll.domain.demographic.Race;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void getInstance() {
        Race race = RaceFactory.getInstance("Black");
        assertEquals("Black", race.getDescription());
        System.out.println(race.toString());
    }
}