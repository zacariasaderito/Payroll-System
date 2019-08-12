package Payroll.repository.impl;

import Payroll.domain.Gender;
import Payroll.repository.GenderRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl repository = null;
    private Set<Gender> genderTable;

    private GenderRepositoryImpl(){
        genderTable = new HashSet<>();

    }

    private Gender findGender(final String genderID){
        return this.genderTable.stream()
                .filter(employeeGender -> employeeGender.getGender().trim().equals(genderID))
                .findAny()
                .orElse(null);
    }

    public static GenderRepositoryImpl getRepository() {
        if (repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }

    @Override
    public Gender create(Gender gender) {
        this.genderTable.add(gender);
        return gender;
    }

    @Override
    public Gender update(Gender gender) {
        Gender toDelete = findGender(gender.getGender());
        if(toDelete != null){
            this.genderTable.remove(toDelete);
            return create(gender);
        }
        return null;
    }

    @Override
    public void delete(String genderNum) {
        Gender gender = findGender(genderNum);
        if (gender !=null) this.genderTable.remove(gender);

    }

    @Override
    public Gender read(String genderID) {
        Gender gender = findGender(genderID);
        return gender;
    }

    @Override
    public Set<Gender> getAll() {
        return this.genderTable;
    }
}
