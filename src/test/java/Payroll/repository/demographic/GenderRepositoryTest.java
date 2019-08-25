package Payroll.repository.demographic;

import Payroll.domain.demographic.Gender;
import Payroll.factory.demographic.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GenderRepositoryTest {

    private GenderRepository repository;
    private Gender gender;
    private String id;


    @Before
    public void setUp() throws Exception {
        repository = GenderRepository.getRepository();
        gender = GenderFactory.getInstance("Male");
        id = gender.getId();
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
    }

    @Test
    public void create() {

        Gender result = repository.create(gender);
        id = result.getId();

        assertNotNull(result);
        System.out.println("Created");
    }

    @Test
    public void update() {

        Gender result = repository.create(gender);
        Gender toReplace = repository.update(gender);
        assertNotNull(toReplace);
        System.out.println("Updated");
    }

    @Test
    public void read() {
        Gender result = repository.create(gender);
        Gender toRead = repository.read(id);
        assertNotNull(toRead);
        System.out.println("Read");
    }

    @Test
    public void delete() {
        Gender result = repository.create(gender);
        repository.delete(id);
        assertNull(repository.read(id));
        System.out.println("Deleted");
    }

    @Test
    public void getAll() {

        Gender result = repository.create(gender);
        Gender result1 = repository.create(GenderFactory.getInstance("Female"));
        Gender result2 = repository.create(GenderFactory.getInstance("Male"));

        assertTrue(repository.getAll().contains(result));

    }
}