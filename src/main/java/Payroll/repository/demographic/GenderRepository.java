package Payroll.repository.demographic;

import Payroll.domain.demographic.Gender;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GenderRepository implements GenderRepositoryInterface{

    private static GenderRepository repository;
    private HashMap<String, Gender> genderHashMap;

    private GenderRepository () {
        genderHashMap = new HashMap<>();
    }

    public static GenderRepository getRepository() {
        if (repository == null)
            repository = new GenderRepository();
        return repository;
    }


    // Override methods
    @Override
    public Gender create(Gender gender) {
        this.genderHashMap.put(gender.getId(), gender);
        return gender;
    }

    @Override
    public Gender update(Gender gender) {
        this.genderHashMap.replace(gender.getId(), gender);
        return this.genderHashMap.get(gender.getId());
    }

    @Override
    public Gender read(String genderID) {
        return this.genderHashMap.get(genderID);
    }

    @Override
    public void delete(String genderID) {
        this.genderHashMap.remove(genderID);
    }

    @Override
    public Set<Gender> getAll() {
        Collection<Gender> genderCollection = genderHashMap.values();
        Set<Gender> genderSet = new HashSet<>();
        genderSet.addAll(genderCollection);
        return genderSet;
    }
}
