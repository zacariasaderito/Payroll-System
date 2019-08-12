package Payroll.factory;

import Payroll.domain.Gender;

public class GenderFactory {
    public static Gender getGender(String gender) {
        String finalGender;
        if (gender.equals(Gender.getFemale()))
        {
            finalGender = gender;
        } else if (gender.equals(Gender.getMale()))
        {
            finalGender = gender;
        }
        else
        {
            finalGender = "Invalid Gender";
        }
        return new Gender.Builder()
                .gender(finalGender)
                .build();
    }



}
