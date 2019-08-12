package Payroll.repository;

import Payroll.domain.Gender;
import Payroll.repository.IRepository.IRepository;

import java.util.Set;

public interface GenderRepository  extends IRepository<Gender,String> {
    Set<Gender> getAll();
}
