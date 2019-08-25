package Payroll.domain.bridge;

public class EmployeeGender {

    private String employeeID, genderID;

    //Constructor
    public EmployeeGender(String employeeID, String genderID) {
        this.employeeID = employeeID;
        this.genderID = genderID;
    }

    // Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getGenderID() {
        return genderID;
    }

    public void setGenderID(String genderID) {
        this.genderID = genderID;
    }
}
