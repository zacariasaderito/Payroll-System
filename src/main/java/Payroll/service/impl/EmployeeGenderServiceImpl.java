package Payroll.service.impl;

import Payroll.domain.Gender;
import Payroll.repository.GenderRepository;
import Payroll.repository.impl.GenderRepositoryImpl;
import Payroll.service.EmployeeGenderService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderServiceImpl service = null;
    private GenderRepository repository;

    private EmployeeGenderServiceImpl() {
        this.repository = GenderRepositoryImpl.getRepository();
    }

    public static EmployeeGenderServiceImpl getService() {
        if (service == null) service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }
}
