package Payroll.factory.bridge;

import Payroll.domain.bridge.EmployeeRace;

public class EmployeeRaceFactory {

    public static EmployeeRace getInstance(String employeeID, String raceID) {
        return new EmployeeRace(employeeID, raceID);
    }

}
