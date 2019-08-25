package Payroll.factory.demographic;

import Payroll.util.GenID;
import Payroll.domain.demographic.Gender;

public class GenderFactory {

    public static Gender getInstance(String description) {
        return new Gender.Builder()
                .getId(GenID.generateID())
                .getDescription(description)
                .builder();
    }
}
