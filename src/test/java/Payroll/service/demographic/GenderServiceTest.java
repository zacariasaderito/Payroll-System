package Payroll.service.demographic;

import Payroll.domain.demographic.Gender;
import Payroll.factory.demographic.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderServiceTest {

    private GenderService service;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        service = GenderService.getService();
        gender = GenderFactory.getInstance("Famele");
    }
    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println("Factory working");
    }

    @Test
    public void create() {
        Gender result = service.create(gender);
        assertSame(gender, result);
        System.out.println("Created");

    }

    @Test
    public void update() {
        Gender result = service.create(gender);
        Gender toReplace = service.update(gender);
        assertEquals(result.getId(), toReplace.getId());

        System.out.println("Updated");
    }

    @Test
    public void read() {
        Gender result = service.create(gender);
        service.read(result.getId());
        assertNotNull(result);
        System.out.println("");
    }

    @Test
    public void delete() {
        Gender result = service.create(gender);
        service.delete(result.getId());
        assertNull(service.read(result.getId()));
        System.out.println("Deleted");
    }

    @Test
    public void getAll() {
        Gender result1 = service.create(GenderFactory.getInstance("Famele"));
        Gender result2 = service.create(GenderFactory.getInstance("Male"));
        Gender result3 = service.create(GenderFactory.getInstance("Famele"));

        assertTrue(service.getAll().contains(result1));
        System.out.println("Read All");

    }
}