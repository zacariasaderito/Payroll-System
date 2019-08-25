package Payroll.factory.demographic;

import Payroll.domain.demographic.Gender;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void getInstance() {
        Gender gender = GenderFactory.getInstance("Male");
        assertEquals("Male", gender.getDescription());
        System.out.println(gender.toString());
    }
}