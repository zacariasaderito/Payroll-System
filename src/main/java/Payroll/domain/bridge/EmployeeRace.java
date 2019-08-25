package Payroll.domain.bridge;

public class EmployeeRace {

    private String employeeID, raceID;

    //Constructor
    public EmployeeRace(String employeeID, String raceID) {
        this.employeeID = employeeID;
        this.raceID = raceID;
    }

    //Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getRaceID() {
        return raceID;
    }

    public void setRaceID(String raceID) {
        this.raceID = raceID;
    }
}
