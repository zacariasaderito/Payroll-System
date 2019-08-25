package Payroll.factory.bridge;

import Payroll.domain.bridge.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender getInstance(String employeeID, String genderID) {
        return new EmployeeGender(employeeID, genderID);
    }

}
