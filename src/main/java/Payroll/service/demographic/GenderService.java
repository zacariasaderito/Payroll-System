package Payroll.service.demographic;

import Payroll.domain.demographic.Gender;
import Payroll.repository.demographic.GenderRepository;

import java.util.Set;

public class GenderService implements GenderServiceInterface{

    private static GenderService service;
    private GenderRepository repository;

    private GenderService(){
        if (repository == null)
            repository = GenderRepository.getRepository();
    }

    public static GenderService getService() {
        if (service == null)
            service = new GenderService();
        return service;
    }

    //OVERRIDE METHODS
    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public Gender read(String genderID) {
        return this.repository.read(genderID);
    }

    @Override
    public void delete(String genderID) {
        this.repository.delete(genderID);
    }

    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }
}
