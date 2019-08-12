package Payroll.repository.impl;

import Payroll.domain.Gender;
import Payroll.factory.GenderFactory;
import Payroll.repository.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {

    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender("Female");
    }

    @Test
    public void create() {
        Gender created = this.repository.create(this.gender);
        System.out.println("In create, created : " + created.getGender());
        getAll();
        Assert.assertSame(created,this.gender);
        Assert.assertEquals("Female",this.gender.getGender());
    }

    @Test
    public void update() {
        String newGender = "Male";
        Gender updated = new Gender.Builder().gender(newGender).build();
        System.out.println("In update, About to update : " + gender.getGender());
        this.repository.update(updated);
        System.out.println("In update, updated to : " + updated.getGender());
        Assert.assertSame(newGender, updated.getGender());
    }

    @Test
    public void delete() {
        this.repository.delete(gender.getGender());
    }

    @Test
    public void read() {
        System.out.println("In read, gender : " + gender.getGender());
        Gender read = this.repository.read(gender.getGender());
        getAll();
        assertNotEquals(gender, read);
    }

    @Test
    public void getAll() {
        Set<Gender> all = this.repository.getAll();
    }
}